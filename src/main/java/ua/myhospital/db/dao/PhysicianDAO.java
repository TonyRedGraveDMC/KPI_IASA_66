package ua.myhospital.db.dao;

import ua.myhospital.db.entity.Physician;

import java.util.List;

public interface PhysicianDAO {

    //create
    void add(Physician physician);

    //read (вернёт список всех адрессов из таблицы Patient)
    List<Physician> getAll();

    Physician getById(Long id);

    //update
    void update(Physician physician);

    //delete
    void remove(Physician physician);
}
