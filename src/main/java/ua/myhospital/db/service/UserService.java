package ua.myhospital.db.service;

import ua.myhospital.db.DatabaseManager;
import ua.myhospital.db.dao.UserDAO;
import ua.myhospital.db.entity.User;
import ua.myhospital.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserService extends DatabaseManager implements UserDAO {

    private Connection connection = getConnection();


    @Override
    public void add(User user) throws SQLException {
        String sql = " INSERT INTO USER(IDUSER, EMAIL, PASSWORD, ROLE, LAST_SEEN, CREATE_DATE) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            // check Timestamp
            preparedStatement.setLong(1, user.getIdUser());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getRole());
            preparedStatement.setTimestamp(5, user.getLastSeen());
            preparedStatement.setTimestamp(6, user.getCreateDate());

            preparedStatement.executeUpdate();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }

    }

    public static void main(String[] args) throws SQLException {
//        UserService userService = new UserService();
//
//        Customer user = new Customer("email", "password", "U",
//                new Timestamp(System.currentTimeMillis()),
//                        new Timestamp(System.currentTimeMillis()));
//        userService.add(user);
    }

    @Override
    public List<Customer> getAll() throws SQLException {
        List<Customer> customerList = new ArrayList<>();
        String sql = "SELECT IDUSER, EMAIL, PASSWORD, ROLE, LAST_SEEN, CREATE_DATE FROM USER";

        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Customer customer = getUser(resultSet);
                customerList.add(customer);
            }
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }

        return customerList;
    }

    private Customer getUser(ResultSet resultSet) throws SQLException {
        Customer customer = new Customer();
        customer.setId(resultSet.getLong("idUSer"));
        customer.setEmail(resultSet.getString("EMAIL"));
        customer.setPassword(resultSet.getString("PASSWORD"));

        // зчитуєм поле ROLE з базєйки
        String roleStr = resultSet.getString("ROLE");

        // шукаєм серед усіх Role енумів той, у якого code = roleStr
        Customer.Role role = Customer.Role.getByCode(roleStr);
        customer.setRole(role);

        Timestamp lastSeen = resultSet.getTimestamp("LAST_SEEN");
        customer.setLastSeen(lastSeen.toLocalDateTime());

        Timestamp createDate = resultSet.getTimestamp("CREATE_DATE");
        customer.setCreateDate(createDate.toLocalDateTime());

        return customer;
    }
}
