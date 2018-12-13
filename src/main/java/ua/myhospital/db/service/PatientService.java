package ua.myhospital.db.service;

import ua.myhospital.db.dao.PatientDAO;
import ua.myhospital.model.Patient;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientService extends AbstractService implements PatientDAO {
   // private Connection connection = getConnection();
    //  DatabaseConnector.getInstance();

    public static void main(String[] args) throws SQLException {
       PatientService patientService = new PatientService();
//        Patient patient = new Patient("name,'bd',22,1,9); drop table patient; insert into patient('name',", "bd", "3122", 1, 3, 10 );
//        Patient patient1 = new Patient(15);
//        patientService.add(patient);

        List<Patient> patientList = patientService.getAll();
        for(Patient p : patientList){
            System.out.println(p);
        }
    }
    @Override

    public void add(Patient patient) throws SQLException {
        String sql = "INSERT INTO PATIENT (Name, Birthday, Phone, User_id, Physician_id, Room_id) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, patient.getName());
            preparedStatement.setString(2, patient.getBirthday());
            preparedStatement.setString(3, patient.getPhone());
            preparedStatement.setLong(4, patient.getUser_id());
            preparedStatement.setLong(5, patient.getPhysician_id());
            preparedStatement.setLong(6, patient.getRoom_id());

            preparedStatement.executeUpdate();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }



    @Override
    public List<Patient> getAll() throws SQLException {
        List<Patient> patientList = new ArrayList<>();

        String sql = "SELECT idPatient, Name, Birthday, Phone, User_id, Physician_id, Room_id FROM PATIENT";
        Statement statement = null;

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Patient patient = getPatient(resultSet);

                patientList.add(patient);
            }
        } finally {
            if(statement != null) {
                statement.close();
            }
        }
        return patientList;
    }

    @Override
    public Patient getBIdPatient(Long idPatient) throws SQLException {
        String sql = "SELECT Name, Birthday, Phone, User_id, Physician_id, Room_id FROM PATIENT WHERE idPatient = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setLong(1, idPatient
        );

        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();

        Patient patient;
        try {
            patient = getPatient(resultSet);
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }

        return patient;
    }

    @Override
    public void update(Patient patient) throws SQLException {
        String sql = "UPDATE PATIENT SET NAME=?, Birthday=?, PHONE=?, User_id=?, Physician_id=?, Room_id=? WHERE idPatient =? ";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, patient.getName());
            preparedStatement.setString(2, patient.getBirthday());
            preparedStatement.setString(3, patient.getPhone());
            preparedStatement.setLong(4, patient.getUser_id());
            preparedStatement.setLong(5, patient.getPhysician_id());
            preparedStatement.setLong(6, patient.getRoom_id());
            preparedStatement.setLong(7, patient.getIdPatient());

            preparedStatement.executeUpdate();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }

    }

    @Override
    public void remove(Patient patient) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = " DELETE FROM PATIENT WHERE idPatient=?";
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1, patient.getIdPatient());

            preparedStatement.executeUpdate();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }

    private Patient getPatient(ResultSet resultSet) throws SQLException {
        Patient patient = new Patient();
        patient.setIdPatient(resultSet.getLong("idPatient"));
        patient.setName(resultSet.getString("Name"));
        patient.setBirthday(resultSet.getString("Birthday"));
        patient.setPhone(resultSet.getString("Phone"));
        patient.setUser_id(resultSet.getLong("User_id"));
        patient.setPhysician_id(resultSet.getLong("Physician_id"));
        patient.setRoom_id(resultSet.getLong("Room_id"));

        return patient;
    }

//    private void runDynamicUpdate(String sql, Patient patient) throws SQLException {
//        PreparedStatement preparedStatement = null;
//        try {
//            preparedStatement= connection.prepareStatement(sql);
//
//            preparedStatement.setString( 1, patient.getName());
//            preparedStatement.setString( 2, patient.getBirthday());
//            preparedStatement.setString( 3, patient.getPhone());
//            preparedStatement.setLong( 4, patient.getInsuranceId());
//            preparedStatement.setLong( 5, patient.getPcp());
//
//            preparedStatement.executeUpdate();
//        }  finally {
//            if(preparedStatement != null){
//                preparedStatement.close();
//            }
//
//            if(connection != null){
//                connection.close();
//            }
//        }
}


