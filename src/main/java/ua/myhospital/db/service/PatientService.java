package ua.myhospital.db.service;

import ua.myhospital.db.DatabaseManager;
import ua.myhospital.db.dao.PatientDAO;
import ua.myhospital.db.entity.Patient;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientService extends DatabaseManager implements PatientDAO {
    private Connection connection = getConnection();

    @Override

    public void add(Patient patient) throws SQLException {
        String sql = "INSERT INTO PATIENT (Name, Address, Phone, InsuranceID, PCP) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, patient.getName());
            preparedStatement.setString(2, patient.getAddress());
            preparedStatement.setString(3, patient.getPhone());
            preparedStatement.setLong(4, patient.getInsuranceId());
            preparedStatement.setLong(5, patient.getPcp());

            preparedStatement.executeUpdate();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (connection != null) {
                connection.close();
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        Patient patient = new Patient(100000003, "name1", "address1", "phone1", 1001, 33);

        PatientService patientService = new PatientService();
        patientService.remove(patient);
//        Patient bySsn = patient.getBySsn(100000001L);
//        List<Patient> all = new PatientService().getAll();
    }

    @Override
    public List<Patient> getAll() throws SQLException {

        List<Patient> patientList = new ArrayList<>();

        String sql = "SELECT SSN, Name, Address, Phone, InsuranceID, PCP FROM PATIENT";

        Statement statement = null;

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Patient patient = getPatient(resultSet);

                patientList.add(patient);
            }
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return patientList;
    }

    @Override
    public Patient getBySsn(Long ssn) throws SQLException {
        String sql = "SELECT SSN, Name, Address, Phone, InsuranceID, PCP FROM PATIENT WHERE SSN = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setLong(1, ssn);

        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();

        Patient patient;
        try {
            patient = getPatient(resultSet);
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }

        return patient;
    }

    @Override
    public void update(Patient patient) throws SQLException {
        String sql = "UPDATE PATIENT SET NAME=?, ADDRESS=?, PHONE=?, INSURANCEID=?, PCP=? WHERE SSN =? ";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, patient.getName());
            preparedStatement.setString(2, patient.getAddress());
            preparedStatement.setString(3, patient.getPhone());
            preparedStatement.setLong(4, patient.getInsuranceId());
            preparedStatement.setLong(5, patient.getPcp());
            preparedStatement.setLong(6, patient.getSsn());

            preparedStatement.executeUpdate();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (connection != null) {
                connection.close();
            }
        }

    }

    @Override
    public void remove(Patient patient) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = " DELETE FROM PATIENT WHERE SSN=?";
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1, patient.getSsn());

            preparedStatement.executeUpdate();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    private Patient getPatient(ResultSet resultSet) throws SQLException {
        Patient patient = new Patient();
        patient.setSsn(resultSet.getLong("SSN"));
        patient.setName(resultSet.getString("Name"));
        patient.setAddress(resultSet.getString("Address"));
        patient.setPhone(resultSet.getString("Phone"));
        patient.setInsuranceId(resultSet.getLong("InsuranceID"));
        patient.setPcp(resultSet.getLong("PCP"));

        return patient;
    }

//    private void runDynamicUpdate(String sql, Patient patient) throws SQLException {
//        PreparedStatement preparedStatement = null;
//        try {
//            preparedStatement= connection.prepareStatement(sql);
//
//            preparedStatement.setString( 1, patient.getName());
//            preparedStatement.setString( 2, patient.getAddress());
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


