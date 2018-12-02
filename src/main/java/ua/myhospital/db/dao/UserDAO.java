package ua.myhospital.db.dao;

import ua.myhospital.db.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {

    //create
    void add(User user) throws SQLException;

    //read (вернёт список всех адрессов из таблицы User)
    List<User> getAll() throws SQLException;

  //  User getIdUser(Long idSUser) throws SQLException;

    //update
   // void update(User user) throws SQLException;

    //delete
 //   void remove(User user) throws SQLException;


}
