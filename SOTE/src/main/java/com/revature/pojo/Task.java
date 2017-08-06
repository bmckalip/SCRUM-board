package com.revature.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @JsonBackReference
//    @JsonIgnore
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
    
    @JsonIgnore
    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }
    
    @Override
  	public int hashCode() {
  		final int prime = 31;
  		int result = 1;
  		result = prime * result + taskId;
  		return result;
  	}

  	@Override
  	public boolean equals(Object obj) {
  		if (this == obj)
  			return true;
  		if (obj == null)
  			return false;
  		if (getClass() != obj.getClass())
  			return false;
  		Task other = (Task) obj;
  		if (taskId != other.taskId)
  			return false;
  		return true;
  	}
    
}
