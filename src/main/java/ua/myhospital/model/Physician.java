package ua.myhospital.model;


import java.time.LocalDate;

public class Physician {

    private long idPhysician;
    private String name;
    private String position;
    private String birthday;
    private long userId;

    public Physician() {
    }

    public Physician(long idPhysician) {
        this.idPhysician = idPhysician;
    }



    public Physician(String name, String position, String birthday, long userId) {
        this.name = name;
        this.position = position;
        this.birthday = birthday;
        this.userId = userId;
    }

    public long getIdPhysician() {
        return idPhysician;
    }

    public void setIdPhysician(long idPhysician) {
        this.idPhysician = idPhysician;
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


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


    public long getUserId() { return userId; }

    public void setUserId(long userId) { this.userId = userId; }


}
