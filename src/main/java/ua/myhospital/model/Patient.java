package ua.myhospital.model;

public class Patient {

    private long idPatient;
    private String name;
    private String birthday;
    private String phone;
    private long user_id;
    private long physician_id;
    private long room_id;


    public Patient(String name, String birthday, String phone, long user_id, long physician_id, long room_id) {
        this.name = name;
        this.birthday = birthday;
        this.phone = phone;
        this.user_id = user_id;
        this.physician_id = physician_id;
        this.room_id = room_id;
    }

    public Patient(long idPatient) {
        this.idPatient = idPatient;
    }

    public Patient() {
    }

    public long getIdPatient() { return idPatient; }

    public void setIdPatient(long idPatient) { this.idPatient = idPatient; }


    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }




    public long getUser_id() { return user_id; }

    public void setUser_id(long user_id) { this.user_id = user_id; }


    public long getPhysician_id() { return physician_id; }

    public void setPhysician_id(long physician_id) { this.physician_id = physician_id; }


    public long getRoom_id() { return room_id; }

    public void setRoom_id(long room_id) { this.room_id = room_id; }

    @Override
    public String toString() {
        return "Patient{" +
                "idPatient=" + idPatient +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phone='" + phone + '\'' +
                ", user_id=" + user_id +
                ", physician_id=" + physician_id +
                ", room_id=" + room_id +
                '}';
    }
}
