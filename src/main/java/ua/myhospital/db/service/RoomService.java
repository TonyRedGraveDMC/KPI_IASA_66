package ua.myhospital.db.service;

import ua.myhospital.db.dao.RoomDAO;
import ua.myhospital.model.Room;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoomService extends  AbstractService implements RoomDAO {
    @Override
    public void add(Room room) throws SQLException {
        String sql = "INSERT INTO ROOM(RoomNumber, TYPE, NumberOfSeats) VALUES(?, ?, ?)";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1, room.getRoomNumber());
            preparedStatement.setString(2, room.getType());
            preparedStatement.setLong(3, room.getNumberOfSeats());
            preparedStatement.executeUpdate();
        } finally {
            if(preparedStatement != null){
                preparedStatement.close();
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        Room room = new Room(1019, "text", 2);
        Room room1 = new Room(20);
        RoomService roomService = new RoomService();
        roomService.remove(room1);

    }

    @Override
    public List<Room> getAll() throws SQLException {
            List<Room> roomList = new ArrayList<>();

            String sql = "SELECT idRoom, RoomNumber, TYPE, NumberOfSeats  FROM ROOM";
            Statement statement = null;

            try {
                statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);


                while (resultSet.next()) {
                    Room room = getRoom(resultSet);

                    roomList.add(room);
                }
            } finally {
                if(statement != null) {
                    statement.close();
                }
            }
            return roomList;
        }

    @Override
    public Room getByIdRoom(Long idRoom) throws SQLException{
        String sql = "SELECT  RoomNumber, TYPE, NumberOfSeats FROM ROOM WHERE idRoom=?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setLong(1, idRoom);

        ResultSet resultset = preparedStatement.executeQuery();
        resultset.next();

        Room room;


        try{
            room = getRoom(resultset);

        }finally{
            if(preparedStatement != null){
                preparedStatement.close();
            }
        }

        return room;
    }

    @Override
    public void update(Room room) throws SQLException {
        String sql = "UPDATE ROOM SET RoomNumber =?, TYPE=?, NumberOfSeats=? WHERE idRoom =? ";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1, room.getRoomNumber());
            preparedStatement.setString(2, room.getType());
            preparedStatement.setLong(3, room.getNumberOfSeats());
            preparedStatement.setLong(4, room.getIdRoom());

            preparedStatement.executeUpdate();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }

    }

    @Override
    public void remove(Room room) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM ROOM WHERE idRoom = ?";


        try{
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, room.getIdRoom());

            preparedStatement.executeUpdate();
        }finally {
            if(preparedStatement != null){
                preparedStatement.close();
            }
        }

    }

    private Room getRoom(ResultSet resultSet) throws SQLException {
        Room room = new Room();
        room.setIdRoom(resultSet.getLong("idRoom"));
        room.setRoomNumber(resultSet.getLong("RoomNumber"));
        room.setType(resultSet.getString("Type"));
        room.setNumberOfSeats(resultSet.getLong("NumberOfSeats"));


        return room;
    }
}
