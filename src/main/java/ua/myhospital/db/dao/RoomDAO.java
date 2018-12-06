package ua.myhospital.db.dao;

import ua.myhospital.db.entity.Room;

import java.util.List;

public interface RoomDAO {

    //create
    void add(Room room);

    List<Room> getAll();

    Room getById(Long id);

    //update
    void update(Room room);

    //delete
    void remove(Room room);
}
