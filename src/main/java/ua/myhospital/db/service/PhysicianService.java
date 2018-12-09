package ua.myhospital.db.service;
import ua.myhospital.db.DatabaseConnector;
import ua.myhospital.db.dao.PhysicianDAO;
import ua.myhospital.db.entity.Physician;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PhysicianService extends AbstractService implements PhysicianDAO {


    @Override
    public void add(Physician physician) throws SQLException {

        String sql = " INSERT INTO PHYSICIAN ( NAME, POSITION, SSN) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, physician.getName());
            preparedStatement.setString(2, physician.getPosition());
            preparedStatement.setLong(3, physician.getSsn());

            preparedStatement.executeUpdate();
        } finally {
            if(preparedStatement != null){
                preparedStatement.close();
            }
        }
    }

    public static void main(String[] args) throws SQLException {

//        PhysicianService physicianService = new PhysicianService();
//        Physician physician = new Physician("STR1\" ,\"P\", 123); drop table PHYSICIAN; INSERT INTO PHYSICIAN(NAME, POSITION, SSN) VALUES(\"STR2\", \"P\", 124);"," Physician", 1312312);
//        physicianService.add(physician);
//        System.out.println(physician);
        Physician physician = new Physician(20000009);
        PhysicianService physicianService = new PhysicianService();
        physicianService.remove(physician);

    }

    @Override
    public List<Physician> getAll() throws SQLException {
        List<Physician> physicianList = new ArrayList<>();

        String sql = "SELECT EmployeeID, NAME, POSITION, SSN FROM PHYSICIAN";
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
    public Physician getById(Long employeeId) throws SQLException {
        String sql = "SELECT EMPLOYEEID, NAME, POSITION, SSN FROM PHYSICIAN WHERE EMPLOYEEID=?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setLong(1, employeeId);

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
        String sql = "UPDATE physician SET NAME=?, Position=?, SSN=? WHERE SSN =? ";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, physician.getName());
            preparedStatement.setString(2, physician.getName());
            preparedStatement.setString(3, physician.getPosition());
            preparedStatement.setLong(4, physician.getSsn());

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

        String sql = "DELETE FROM PHYSICIAN WHERE EMPLOYEEID = ?";


        try{
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, physician.getEmployeeId());

            preparedStatement.executeUpdate();
        }finally {
            if(preparedStatement != null){
                preparedStatement.close();
            }
        }

    }

    private Physician getPhysician(ResultSet resultSet) throws SQLException {
        Physician physician = new Physician();
        physician.setEmployeeId(resultSet.getLong("EMPLOYEEID"));
        physician.setName(resultSet.getString("Name"));
        physician.setPosition(resultSet.getString("POSITION"));
        physician.setSsn(resultSet.getLong("SSN"));

        return physician;
    }
}
