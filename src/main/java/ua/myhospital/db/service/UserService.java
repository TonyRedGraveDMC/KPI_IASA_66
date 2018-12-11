package ua.myhospital.db.service;

import ua.myhospital.core.Constant;
import ua.myhospital.core.Converter;
import ua.myhospital.db.dao.UserDAO;
import ua.myhospital.model.User;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserService extends AbstractService implements UserDAO {

    @Override
    public void add(User user) throws SQLException {
        String sql = "INSERT INTO USER(LOGIN, PASSWORD, ROLE, CREATE_DATE) VALUES  (?, ?, ?, ?)";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            // check Timestamp
            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getRole().getCode());
            preparedStatement.setTimestamp(4, Converter.convertToTimestamp(user.getCreateDate()));

            preparedStatement.executeUpdate();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }

        }

    }

    public static void main(String[] args) throws SQLException {
//        UserService userService = new UserService();
//        User user = new User("234", "password", Constant.Role.DOCTOR, LocalDateTime.now());
//        userService.add(user);

        User user = new User(23);
        UserService userService = new UserService();
        userService.remove(user);
    }

    @Override
    public List<User> getAll() throws SQLException {
        List<User> userList = new ArrayList<>();
        String sql = "SELECT IDUSER, LOGIN, PASSWORD, ROLE,CREATE_DATE FROM USER";

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

    @Override
    public User getIdUser(Long idUser) throws SQLException {
        return null;
    }

    @Override
    public void update(User user) throws SQLException {
        String sql = "UPDATE USER SET LOGIN=?, PASSWORD=?, ROLE=?,CREATE_DATE=? WHERE idUSER =? ";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getRole().getCode());
            preparedStatement.setTimestamp(4, Converter.convertToTimestamp(user.getCreateDate()));

            preparedStatement.executeUpdate();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }

    }

    @Override
    public void remove(User user) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM USER WHERE idUser = ?";


        try{
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, user.getId());

            preparedStatement.executeUpdate();
        }finally {
            if(preparedStatement != null){
                preparedStatement.close();
            }
        }
    }

    private User getUser(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setId(resultSet.getLong("idUSer"));
        user.setLogin(resultSet.getString("LOGIN"));
        user.setPassword(resultSet.getString("PASSWORD"));

        // зчитуєм поле ROLE з базєйки
        String roleStr = resultSet.getString("ROLE");

        // шукаєм серед усіх Role енумів той, у якого code = roleStr
        Constant.Role role = Constant.Role.getByCode(roleStr);
        user.setRole(role);

        Timestamp createDate = resultSet.getTimestamp("CREATE_DATE");
        user.setCreateDate(createDate.toLocalDateTime());

        return user;
    }

    public Constant.Role getRoleByLoginPassword(final String login, final String password) throws SQLException {
        Constant.Role result = Constant.Role.UNKNOWN;

        for (User user : getAll()) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                result = user.getRole();
                break;
            }
        }

        return result;
    }

    public boolean doesUserExist(final String login, final String password) throws SQLException {

        boolean result = false;

        for (User user : getAll()) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                result = true;
                break;
            }
        }

        return result;
    }


}
