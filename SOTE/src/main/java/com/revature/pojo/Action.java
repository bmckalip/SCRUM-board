package com.revature.pojo;

import javax.persistence.*;
import java.io.Serializable;


public class Action implements Serializable {
/*
    @Id
    @GeneratedValue
    private int actionId;

    @Column(name="a_name", nullable = false)
    private String actionName;
//
//    @ManyToOne
//    @JoinColumn(name = "a_id")
    private History history;

    public Action(String actionName, History history) {
        this.actionName = actionName;
        this.history = history;
    }

    public int getActionId() {
        return actionId;
    }

    public void setActionId(int actionId) {
        this.actionId = actionId;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Action)) return false;

        Action action = (Action) o;

        if (getActionId() != action.getActionId()) return false;
        if (getActionName() != null ? !getActionName().equals(action.getActionName()) : action.getActionName() != null)
            return false;
        return getHistory() != null ? getHistory().equals(action.getHistory()) : action.getHistory() == null;
    }

    @Override
    public int hashCode() {
        int result = getActionId();
        result = 31 * result + (getActionName() != null ? getActionName().hashCode() : 0);
        result = 31 * result + (getHistory() != null ? getHistory().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Action{" +
                "actionId=" + actionId +
                ", actionName='" + actionName + '\'' +
                ", history=" + history +
                '}';
    }
    */
}
