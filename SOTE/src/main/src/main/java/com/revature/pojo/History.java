package com.revature.pojo;

import java.io.Serializable;
import java.util.Date;

public class History implements Serializable{
    private int historyId;
    private User user;
    private Action action;
    private String historyDescription;
    private Date historyDate;

    public History(){}

    public History(int historyId, User user, Action action, String historyDescription, Date historyDate) {
        this.historyId = historyId;
        this.user = user;
        this.action = action;
        this.historyDescription = historyDescription;
        this.historyDate = historyDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof History)) return false;

        History history = (History) o;

        if (getHistoryId() != history.getHistoryId()) return false;
        if (getuser() != null ? !getuser().equals(history.getuser()) : history.getuser() != null) return false;
        if (getAction() != null ? !getAction().equals(history.getAction()) : history.getAction() != null) return false;
        if (getHistoryDescription() != null ? !getHistoryDescription().equals(history.getHistoryDescription()) : history.getHistoryDescription() != null)
            return false;
        return getHistoryDate() != null ? getHistoryDate().equals(history.getHistoryDate()) : history.getHistoryDate() == null;
    }

    @Override
    public int hashCode() {
        int result = getHistoryId();
        result = 31 * result + (getuser() != null ? getuser().hashCode() : 0);
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

    public User getuser() {
        return user;
    }

    public void setuser(User user) {
        this.user = user;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
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
}
