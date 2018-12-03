package ua.myhospital.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Customer {
    private long id;
    private String email;
    private String password;
    private Role role;
    private LocalDateTime lastSeen;
    private LocalDateTime createDate;

    public Customer() {
    }

    public Customer(String email, String password, Role role, LocalDateTime lastSeen, LocalDateTime createDate) {
        this.email = email;
        this.password = password;
        this.role = role;
        this.lastSeen = lastSeen;
        this.createDate = createDate;
    }

    public Customer(long id, String email, String password, Role role, LocalDateTime lastSeen, LocalDateTime createDate) {
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

    public enum Role {
        ADMIN("A"),
        PATIENT("P"),
        DOCTOR("D"),
        UNKNOWN("U");

        private String code;

        public String getCode() {
            return code;
        }

        Role(String code) {
            this.code = code;
        }

        /**
         * Пробігає в циклі по всім енумчикам і шукає той, в кого code збігається з параметром code
         *
         * @param code
         * @return
         */
        public static Role getByCode(String code) {
            for (Role value : values()) {
                if (value.getCode().equals(code)) {
                    return value;
                }
            }

            return null;
        }
    }


}
