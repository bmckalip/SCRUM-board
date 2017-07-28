package com.revature.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private int userId;
    private String userEmail;
    private String userPassword;
    private String userFirstName;
    private String userLastName;

    public User(){}

    public User(int userId, String userEmail, String userPassword, String userFirstName, String userLastName) {
        this.userId = userId;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
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
}
