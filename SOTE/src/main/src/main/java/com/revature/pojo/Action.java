package com.revature.pojo;

import java.io.Serializable;

public class Action implements Serializable {
    private int actionId;
    private String actionName;

    public Action(){}

    public Action(int actionId, String actionName) {
        this.actionId = actionId;
        this.actionName = actionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Action)) return false;

        Action action = (Action) o;

        if (getActionId() != action.getActionId()) return false;
        return getActionName() != null ? getActionName().equals(action.getActionName()) : action.getActionName() == null;
    }

    @Override
    public int hashCode() {
        int result = getActionId();
        result = 31 * result + (getActionName() != null ? getActionName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Action{" +
                "actionId=" + actionId +
                ", actionName='" + actionName + '\'' +
                '}';
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
}
