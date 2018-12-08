package ua.myhospital.model;

import ua.myhospital.core.Constant.Role;

import java.time.LocalDateTime;

public class User {
    private long id;
    private String email;
    private String password;
    private Role role;
    private LocalDateTime lastSeen;
    private LocalDateTime createDate;

    public User() {
    }

    public User(String email, String password, Role role, LocalDateTime lastSeen, LocalDateTime createDate) {
        this.email = email;
        this.password = password;
        this.role = role;
        this.lastSeen = lastSeen;
        this.createDate = createDate;
    }

    public User(long id, String email, String password, Role role, LocalDateTime lastSeen, LocalDateTime createDate) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.role = role;
        this.lastSeen = lastSeen;
        this.createDate = createDate;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;

    }

    public Role getRole() {
        return role;
    }

    public LocalDateTime getLastSeen() {
        return lastSeen;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setLastSeen(LocalDateTime lastSeen) {
        this.lastSeen = lastSeen;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
}
