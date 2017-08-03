package com.revature.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task{

    @Id
    @Column(name ="t_id")
    private int taskId;
    @Column(name = "t_desc")
    private String taskDescription;
    @Column(name = "t_status")
    private int taskStatus;

    private Story story;

    public Task(){}

    public Task(int taskId, String taskDescription, int taskStatus, Story story) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
        this.story = story;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;

        Task task = (Task) o;

        if (getTaskId() != task.getTaskId()) return false;
        if (getTaskStatus() != task.getTaskStatus()) return false;
        if (getTaskDescription() != null ? !getTaskDescription().equals(task.getTaskDescription()) : task.getTaskDescription() != null)
            return false;
        return getStory() != null ? getStory().equals(task.getStory()) : task.getStory() == null;
    }

    @Override
    public int hashCode() {
        int result = getTaskId();
        result = 31 * result + (getTaskDescription() != null ? getTaskDescription().hashCode() : 0);
        result = 31 * result + getTaskStatus();
        result = 31 * result + (getStory() != null ? getStory().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskStatus=" + taskStatus +
                ", story=" + story +
                '}';
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public int getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(int taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }
}
