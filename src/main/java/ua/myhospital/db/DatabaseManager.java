package ua.myhospital.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

    private static DatabaseManager instance;

    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String SCHEMA = "hospitaldb";
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/";

    private DatabaseManager(){

    }

    public  static  synchronized  DatabaseManager getInstance(){
        if(instance == null ){
            instance = new DatabaseManager();
        }
        return instance;
    }
    public static Connection getConnection() {

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(CONNECTION_STRING + SCHEMA, USER, PASSWORD);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}