package ua.myhospital.db.dao;

import ua.myhospital.db.entity.User;
import ua.myhospital.model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {

    //create
    void add(User user) throws SQLException;

    List<Customer> getAll() throws SQLException;

  //  Customer getId(Long idSUser) throws SQLException;

    //update
   // void update(Customer user) throws SQLException;

    //delete
 //   void remove(Customer user) throws SQLException;


}
