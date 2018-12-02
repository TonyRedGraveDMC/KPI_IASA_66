package ua.myhospital.db.service;


import ua.myhospital.db.DatabaseManager;
import ua.myhospital.db.dao.UserDAO;
import ua.myhospital.db.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserService extends DatabaseManager implements UserDAO {

    private Connection connection = getConnection();


    @Override
    public void add(User user) throws SQLException {
        String sql = " INSERT INTO USER(IDUSER, EMAIL, PASSWORD, ROLE, LAST_SEEN, CREATE_DATE) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = null;

        try{
            preparedStatement = connection.prepareStatement(sql);
            // check Timestamp
            preparedStatement.setLong(1, user.getIdUser());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPassowrd());
            preparedStatement.setString(4, user.getRole());
            preparedStatement.setTimestamp(5, user.getLastSeen());
            preparedStatement.setTimestamp(6, user.getCreateDate());

            preparedStatement.executeUpdate();
        }finally {
            if(preparedStatement != null){
                preparedStatement.close();
            }
            if(connection != null){
                connection.close();
            }
        }

    }

    public static void main(String[] args) throws SQLException {
        UserService userService = new UserService();

        User user = new User("email", "password", "U",
                new Timestamp(System.currentTimeMillis()),
                        new Timestamp(System.currentTimeMillis()));
        userService.add(user);
    }

    @Override
    public List<User> getAll() throws SQLException {

        List<User> userList = new ArrayList<>();

        String sql = "SELECT IDUSER, EMAIL, PASSWORD, ROLE, LAST_SEEN, CREATE_DATE FROM USER";

        Statement statement = null;
        try{
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                User user = getUser(resultSet);
                userList.add(user);
            }
        }finally {
            if(statement != null){
                statement.close();
            }
            if(connection != null){
                connection.close();
            }
        }
        return userList;
    }

    private User getUser(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setIdUser(resultSet.getLong("idUSer"));
        user.setEmail(resultSet.getString("EMAIL"));
        user.setPassowrd(resultSet.getString("PASSWORD"));
        user.setRole(resultSet.getString("ROLE"));
        user.setLastSeen(resultSet.getTimestamp("LAST_SEEN"));
        user.setCreateDate(resultSet.getTimestamp("CREATE_DATE"));

        return user;
    }
}
