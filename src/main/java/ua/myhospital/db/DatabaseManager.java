package ua.myhospital.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {


    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String SCHEMA = "hospitaldb";
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/";

    public static Connection getConnection() {

        Connection connection = null;

//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(CONNECTION_STRING + SCHEMA, USER, PASSWORD);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

//        if (connection != null) {
//            System.out.println("You made it, take control your database now!");
//        } else {
//            System.out.println("Failed to make connection!");
//        }
        return connection;
    }
}