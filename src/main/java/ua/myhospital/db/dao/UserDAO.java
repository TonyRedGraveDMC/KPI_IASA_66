package ua.myhospital.db.dao;

import ua.myhospital.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {

    //create
    void add(User user) throws SQLException;

    List<User> getAll() throws SQLException;

     User getIdUser(Long idUser) throws SQLException;

    //update
    void update(User user) throws SQLException;

    //delete
    void remove(User user) throws SQLException;


}
