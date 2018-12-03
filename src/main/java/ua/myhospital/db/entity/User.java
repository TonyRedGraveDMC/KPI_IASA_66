package ua.myhospital.db.entity;


public class User {

  private long idUser;
  private String email;
  private String password;
  private String role;
  private java.sql.Timestamp lastSeen;
  private java.sql.Timestamp createDate;


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


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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

}
