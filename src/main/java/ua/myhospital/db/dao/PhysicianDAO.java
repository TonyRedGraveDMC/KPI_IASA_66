package ua.myhospital.db.dao;

import ua.myhospital.model.Physician;

import java.sql.SQLException;
import java.util.List;

public interface PhysicianDAO {

    //create
    void add(Physician physician) throws SQLException;

    //read (вернёт список всех адрессов из таблицы Patient)
    List<Physician> getAll() throws SQLException;

    Physician getById(Long id) throws SQLException;

    //update
    void update(Physician physician) throws SQLException;

    //delete
    void remove(Physician physician) throws SQLException;
}
