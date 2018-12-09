package ua.myhospital.db.dao;

import ua.myhospital.model.Room;

import java.sql.SQLException;
import java.util.List;

public interface RoomDAO {

    //create
    void add(Room room) throws SQLException;

    List<Room> getAll();

    Room getById(Long id);

    //update
    void update(Room room);

    //delete
    void remove(Room room);
}
