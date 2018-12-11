package ua.myhospital.db.dao;

import ua.myhospital.model.Patient;

import java.sql.SQLException;
import java.util.List;

public interface PatientDAO {

    //create
    void add(Patient patient) throws SQLException;

    //read (вернёт список всех адрессов из таблицы Patient)
    List<Patient> getAll() throws SQLException;

    Patient getBIdPatient(Long Ssn) throws SQLException;

    //update
    void update(Patient patient) throws SQLException;

    //delete
    void remove(Patient patient) throws SQLException;


}
