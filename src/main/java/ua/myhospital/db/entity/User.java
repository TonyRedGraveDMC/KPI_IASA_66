package ua.myhospital.db.entity;


import java.sql.Timestamp;

public class User {



  private long idUser;
  private String email;
  private String passowrd;


  private String role;
  private java.sql.Timestamp lastSeen;
  private java.sql.Timestamp createDate;


  public User() {
  }

  public User(long idUser, String email, String passowrd, String role, Timestamp lastSeen, Timestamp createDate) {
    this.idUser = idUser;
    this.email = email;
    this.passowrd = passowrd;
    this.role = role;
    this.lastSeen = lastSeen;
    this.createDate = createDate;
  }



  public User(String email, String passowrd, String role, Timestamp lastSeen, Timestamp createDate) {
    this.email = email;
    this.passowrd = passowrd;
    this.role = role;
    this.lastSeen = lastSeen;
    this.createDate = createDate;
  }

  public long getIdUser() {
    return idUser;
  }

  public void setIdUser(long idUser) {
    this.idUser = idUser;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getPassowrd() {
    return passowrd;
  }

  public void setPassowrd(String passowrd) {
    this.passowrd = passowrd;
  }


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  public java.sql.Timestamp getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(java.sql.Timestamp lastSeen) {
    this.lastSeen = lastSeen;
  }


  public java.sql.Timestamp getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Timestamp createDate) {
    this.createDate = createDate;
  }

  @Override
  public String toString() {
    return "User{" +
            "idUser=" + idUser +
            ", email='" + email + '\'' +
            ", passowrd='" + passowrd + '\'' +
            ", role='" + role + '\'' +
            ", lastSeen=" + lastSeen +
            ", createDate=" + createDate +
            '}';
  }

}

