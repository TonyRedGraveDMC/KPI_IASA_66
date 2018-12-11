package ua.myhospital.db.dao;

import ua.myhospital.model.Room;

import java.sql.SQLException;
import java.util.List;

public interface RoomDAO {

    //create
    void add(Room room) throws SQLException;

    List<Room> getAll() throws SQLException;

    Room getByIdRoom(Long idRoom) throws SQLException;

    //update
    void update(Room room) throws SQLException;

    //delete
    void remove(Room room) throws SQLException;
}
