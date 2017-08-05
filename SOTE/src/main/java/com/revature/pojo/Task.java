package com.revature.pojo;

import javax.persistence.*;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @SequenceGenerator(name = "seq", sequenceName = "task_seq")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @Column(name = "t_id")
    private int taskId;

    @Column(name = "t_desc", nullable = false)
    private String taskDescription;

    @Column(name = "t_status", nullable = false)
    private int taskStatus;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "S_ID")
    private Story story;

    public Task() {
    }

    public Task(String taskDescription, int taskStatus, Story story) {
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
        this.story = story;
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
