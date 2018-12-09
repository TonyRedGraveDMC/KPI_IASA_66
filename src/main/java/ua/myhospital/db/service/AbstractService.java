package ua.myhospital.db.service;

import ua.myhospital.db.DatabaseConnector;

import java.sql.Connection;

public abstract class AbstractService {
    protected Connection connection = DatabaseConnector.getInstance().getConnection();

}
