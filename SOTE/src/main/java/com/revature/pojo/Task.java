package com.revature.pojo;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="task")
public class Task implements Serializable {

    @Id
    @Column(name="t_id")
    int id;
    @Column(name = "t_desc")
    String description;
    @Column(name = "t_status")
    int status;
    @Column(name="s_id")
    int storyId;

    private Story story;

    public Task(){}

    public Task(int id, String description, int status, int storyId){
        super();
        this.id = id;
        this.description = description;
        this.status = status;
        this.storyId = storyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStoryId() {
        return storyId;
    }

    public void setStoryId(int storyId) {
        this.storyId = storyId;
    }

    @OneToMany(mappedBy = "board")
    public Story getStory() {
        return story;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", storyId=" + storyId +
                ", story=" + story +
                '}';
    }

    public void setStory(Story story) {
        this.story = story;
    }

}
