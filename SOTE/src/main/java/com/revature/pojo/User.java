package com.revature.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User implements Serializable{

    @Id
    @SequenceGenerator(name = "seq", sequenceName = "users_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @Column(name = "u_id")
    private int userId;

    @Column(name = "u_email", nullable = false)
    private String userEmail;

    @Column(name = "u_password", nullable = false)
    private String userPassword;

    @Column(name = "u_permission")
    private String permission;

    @Column(name = "u_fName", nullable = false)
    private String userFirstName;

    @Column(name = "u_lName", nullable = false)
    private String userLastName;

    public User(){}

    public User(String userEmail, String userPassword, String permission, String userFirstName, String userLastName) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.permission = permission;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", permission='" + permission + '\'' +
                ", userFirstName='" + userFirstName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

}
