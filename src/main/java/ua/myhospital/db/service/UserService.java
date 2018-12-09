package ua.myhospital.db.service;

import ua.myhospital.core.Constant;
import ua.myhospital.core.Converter;
import ua.myhospital.db.DatabaseConnector;
import ua.myhospital.db.dao.UserDAO;
import ua.myhospital.model.User;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserService extends AbstractService implements UserDAO {

    @Override
    public void add(User user) throws SQLException {
        String sql = "INSERT INTO USER(EMAIL, PASSWORD, ROLE, LAST_SEEN, CREATE_DATE) VALUES  (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            // check Timestamp
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getRole().getCode());
            preparedStatement.setTimestamp(4, Converter.convertToTimestamp(user.getLastSeen()));
            preparedStatement.setTimestamp(5, Converter.convertToTimestamp(user.getCreateDate()));

            preparedStatement.executeUpdate();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }

        }

    }

    public static void main(String[] args) throws SQLException {
        UserService userService = new UserService();

        User user = new User("123", "password", Constant.Role.PATIENT,
                LocalDateTime.now(),
                LocalDateTime.now());
        userService.add(user);
    }

    @Override
    public List<User> getAll() throws SQLException {
        List<User> userList = new ArrayList<>();
        String sql = "SELECT IDUSER, EMAIL, PASSWORD, ROLE, LAST_SEEN, CREATE_DATE FROM USER";

        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                User user = getUser(resultSet);
                userList.add(user);
            }
        } finally {
            if (statement != null) {
                statement.close();
            }

        }

        return userList;
    }

    private User getUser(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setId(resultSet.getLong("idUSer"));
        user.setEmail(resultSet.getString("EMAIL"));
        user.setPassword(resultSet.getString("PASSWORD"));

        // зчитуєм поле ROLE з базєйки
        String roleStr = resultSet.getString("ROLE");

        // шукаєм серед усіх Role енумів той, у якого code = roleStr
        Constant.Role role = Constant.Role.getByCode(roleStr);
        user.setRole(role);

        Timestamp lastSeen = resultSet.getTimestamp("LAST_SEEN");
        user.setLastSeen(lastSeen.toLocalDateTime());

        Timestamp createDate = resultSet.getTimestamp("CREATE_DATE");
        user.setCreateDate(createDate.toLocalDateTime());

        return user;
    }

    public Constant.Role getRoleByLoginPassword(final String login, final String password) throws SQLException {
        Constant.Role result = Constant.Role.UNKNOWN;

        for (User user : getAll()) {
            if (user.getEmail().equals(login) && user.getPassword().equals(password)) {
                result = user.getRole();
                break;
            }
        }

        return result;
    }

    public boolean doesUserExist(final String login, final String password) throws SQLException {

        boolean result = false;

        for (User user : getAll()) {
            if (user.getEmail().equals(login) && user.getPassword().equals(password)) {
                result = true;
                break;
            }
        }

        return result;
    }


}
