package ua.myhospital.db.service;

import ua.myhospital.db.dao.RoomDAO;
import ua.myhospital.model.Room;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class RoomService extends  AbstractService implements RoomDAO {
    @Override
    public void add(Room room) throws SQLException {
        String sql = "INSERT INTO ROOM(TYPE, BLOCKFLOOR, BLOCKCODE, UNAVAILABLE) VALUES(?, ?, ?, ?)";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, room.getType());
            preparedStatement.setLong(2, room.getBlockFloor());
            preparedStatement.setLong(3, room.getBlockCode());
            preparedStatement.setLong(4, room.getUnavailable());


            preparedStatement.executeUpdate();
        } finally {
            if(preparedStatement != null){
                preparedStatement.close();
            }
        }
    }

    @Override
    public List<Room> getAll() {
//            List<Room> roomList = new ArrayList<>();
//
//            String sql = "SELECT Number, TYPE, BLOCKFLOOR, BLOCKCODE , Unavailable FROM ROOM";
//            Statement statement = null;
//
//            try {
//                statement = connection.createStatement();
//                ResultSet resultSet = statement.executeQuery(sql);
//
//
//                while (resultSet.next()) {
//                    Room room = getPhysician(resultSet);
//
//                    roomList.add(room);
//                }
//            } finally {
//                if(statement != null) {
//                    statement.close();
//                }
//            }
//
//            return physicianList;
        return null;
        }

    @Override
    public Room getById(Long id) {
        return null;
    }

    @Override
    public void update(Room room) {

    }

    @Override
    public void remove(Room room) {

    }
}
