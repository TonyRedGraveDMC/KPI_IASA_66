package ua.myhospital.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private static DatabaseConnector instance;

    private Connection connection;
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String SCHEMA = "hospitaldb";
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/";

    private DatabaseConnector(){

    }

    public  static  synchronized DatabaseConnector getInstance(){
        if(instance == null ){
            instance = new DatabaseConnector();
        }
        return instance;
    }

    public Connection getConnection() {
        if(connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(CONNECTION_STRING + SCHEMA, USER, PASSWORD);

            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public void CloseConnection(){
        try {
            if(connection != null && !connection.isClosed()){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}