package com.revature.pojo;

import javax.persistence.*;
import java.io.Serializable;

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

    @Column(name = "u_fName", nullable = false)
    private String userFirstName;

    @Column(name = "u_lName", nullable = false)
    private String userLastName;

    public User(){}

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userFirstName='" + userFirstName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getUserId() != user.getUserId()) return false;
        if (getUserEmail() != null ? !getUserEmail().equals(user.getUserEmail()) : user.getUserEmail() != null)
            return false;
        if (getUserPassword() != null ? !getUserPassword().equals(user.getUserPassword()) : user.getUserPassword() != null)
            return false;
        if (getUserFirstName() != null ? !getUserFirstName().equals(user.getUserFirstName()) : user.getUserFirstName() != null)
            return false;
        return getUserLastName() != null ? getUserLastName().equals(user.getUserLastName()) : user.getUserLastName() == null;
    }

    @Override
    public int hashCode() {
        int result = getUserId();
        result = 31 * result + (getUserEmail() != null ? getUserEmail().hashCode() : 0);
        result = 31 * result + (getUserPassword() != null ? getUserPassword().hashCode() : 0);
        result = 31 * result + (getUserFirstName() != null ? getUserFirstName().hashCode() : 0);
        result = 31 * result + (getUserLastName() != null ? getUserLastName().hashCode() : 0);
        return result;
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

    public User(String userEmail, String userPassword, String userFirstName, String userLastName) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
    }
}
