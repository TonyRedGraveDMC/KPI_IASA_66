package ua.myhospital.db.service;
import ua.myhospital.db.dao.PhysicianDAO;
import ua.myhospital.model.Physician;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PhysicianService extends AbstractService implements PhysicianDAO {


    @Override
    public void add(Physician physician) throws SQLException {

        String sql = " INSERT INTO PHYSICIAN ( NAME, POSITION, Birthday, UserId) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, physician.getName());
            preparedStatement.setString(2, physician.getPosition());
            preparedStatement.setString(3, physician.getBirthday());
            preparedStatement.setLong(4,physician.getUserId());

            preparedStatement.executeUpdate();
        } finally {
            if(preparedStatement != null){
                preparedStatement.close();
            }
        }
    }

    public static void main(String[] args) throws SQLException {
       PhysicianService physicianService = new PhysicianService();
//       Physician physician = new Physician("name", "position", "bd", 1);
//       Physician physician1 = new Physician(20);
//       physicianService.remove(physician1);

        List<Physician> physicianList = physicianService.getAll();
        for(Physician a: physicianList){
            System.out.println(a);
        }
    }

    @Override
    public List<Physician> getAll() throws SQLException {
        List<Physician> physicianList = new ArrayList<>();

        String sql = "SELECT idPhysician, NAME, POSITION, Birthday, UserId FROM physician";
        Statement statement = null;

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Physician physician = getPhysician(resultSet);

                physicianList.add(physician);
            }
        } finally {
            if(statement != null) {
                statement.close();
            }
        }

        return physicianList;
    }

    @Override
    public Physician getByIdPhysician(Long idPhysician) throws SQLException {

        String sql = "SELECT NAME, POSITION, Birthday, UserId FROM physician WHERE idPhysician=?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setLong(1, idPhysician);

        ResultSet resultset = preparedStatement.executeQuery();
        resultset.next();

        Physician physician;

        try{
            physician = getPhysician(resultset);

        }finally{
            if(preparedStatement != null){
                preparedStatement.close();
            }
        }

        return physician;
    }

    @Override
    public void update(Physician physician) throws SQLException {
        String sql = "UPDATE physician SET NAME=?, Position=?, Birthday=?, UserId=? WHERE idPhysician =? ";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, physician.getName());
            preparedStatement.setString(2, physician.getPosition());
            preparedStatement.setString(3, physician.getBirthday());
            preparedStatement.setLong(4, physician.getUserId());
            preparedStatement.setLong(5, physician.getIdPhysician());

            preparedStatement.executeUpdate();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }

    }

    @Override
    public void remove(Physician physician) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM physician WHERE idPhysician = ?";


        try{
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, physician.getIdPhysician());

            preparedStatement.executeUpdate();
        }finally {
            if(preparedStatement != null){
                preparedStatement.close();
            }
        }

    }

    private Physician getPhysician(ResultSet resultSet) throws SQLException {
        Physician physician = new Physician();
        physician.setIdPhysician(resultSet.getLong("idPhysician"));
        physician.setName(resultSet.getString("Name"));
        physician.setPosition(resultSet.getString("Position"));
        physician.setBirthday(resultSet.getString("Birthday"));
        physician.setUserId(resultSet.getLong("UserId"));

        return physician;
    }
}
