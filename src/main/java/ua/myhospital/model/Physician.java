package ua.myhospital.model;


public class Physician {

    public Physician(long employeeId) {
        this.employeeId = employeeId;
    }

    private long employeeId;
    private String name;
    private String position;
    private long ssn;

    public Physician() {
    }

    public Physician(String name, String position, long ssn) {
        this.name = name;
        this.position = position;
        this.ssn = ssn;
    }

    public Physician(long employeeId, String name, String position, long ssn) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.ssn = ssn;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

}
