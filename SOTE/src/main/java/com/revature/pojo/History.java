package com.revature.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class History implements Serializable{
/*
    @Id
    @GeneratedValue
    private int historyId;

    @OneToMany(mappedBy = "u_id")
    List<User> user  = new ArrayList<User>();

    @OneToMany(mappedBy = "a_id")
    List<Action> action  = new ArrayList<Action>();

    @Column(name = "h_desc")
    private String historyDescription;

    @Column(name = "h_time", insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date historyDate;

    public History(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof History)) return false;

        History history = (History) o;

        if (getHistoryId() != history.getHistoryId()) return false;
        if (getUser() != null ? !getUser().equals(history.getUser()) : history.getUser() != null) return false;
        if (getAction() != null ? !getAction().equals(history.getAction()) : history.getAction() != null) return false;
        if (getHistoryDescription() != null ? !getHistoryDescription().equals(history.getHistoryDescription()) : history.getHistoryDescription() != null)
            return false;
        return getHistoryDate() != null ? getHistoryDate().equals(history.getHistoryDate()) : history.getHistoryDate() == null;
    }

    @Override
    public int hashCode() {
        int result = getHistoryId();
        result = 31 * result + (getUser() != null ? getUser().hashCode() : 0);
        result = 31 * result + (getAction() != null ? getAction().hashCode() : 0);
        result = 31 * result + (getHistoryDescription() != null ? getHistoryDescription().hashCode() : 0);
        result = 31 * result + (getHistoryDate() != null ? getHistoryDate().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "History{" +
                "historyId=" + historyId +
                ", user=" + user +
                ", action=" + action +
                ", historyDescription='" + historyDescription + '\'' +
                ", historyDate=" + historyDate +
                '}';
    }

    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public List<Action> getAction() {
        return action;
    }

    public void setAction(List<Action> action) {
        this.action = action;
    }

    public String getHistoryDescription() {
        return historyDescription;
    }

    public void setHistoryDescription(String historyDescription) {
        this.historyDescription = historyDescription;
    }

    public Date getHistoryDate() {
        return historyDate;
    }

    public void setHistoryDate(Date historyDate) {
        this.historyDate = historyDate;
    }

    public History(List<User> user, List<Action> action, String historyDescription, Date historyDate) {
        this.user = user;
        this.action = action;
        this.historyDescription = historyDescription;
        this.historyDate = historyDate;
    }
    */
}
