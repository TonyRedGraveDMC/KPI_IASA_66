package ua.myhospital.model;

import ua.myhospital.core.Constant.Role;

import java.time.LocalDateTime;

public class User {
    private long id;



    private String login;
    private String password;
    private Role role;
    private LocalDateTime createDate;

    public User() {
    }


    public User(String login, String password, Role role, LocalDateTime createDate) {
        this.login = login;
        this.password = password;
        this.role = role;
        this.createDate = createDate;
    }


    public User(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;

    }



    public Role getRole() {
        return role;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", createDate=" + createDate +
                '}';
    }
}
