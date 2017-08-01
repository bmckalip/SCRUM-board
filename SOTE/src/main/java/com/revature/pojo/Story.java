package com.revature.pojo;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.JoinFormula;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "story")
public class Story{
    @Id
    @SequenceGenerator(name = "seq", sequenceName = "story_seq")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @Column(name = "s_id")
    private int storyId;
    @Column(name = "s_title", nullable = false)
    private String storyTitle;
    @Column(name = "s_desc")
    private String storyDescription;
    @Column(name = "s_points", nullable = false)
    private int storyPoints;
    @OneToMany(cascade = CascadeType.ALL,
        mappedBy = "story", orphanRemoval = true)
    private List<Task> task = new ArrayList<>();

    @ManyToOne
    private Lane lane;


    public Story(){}

    public Story(String storyTitle, String storyDescription, int storyPoints, List<Task> task, Lane lane) {
        this.storyTitle = storyTitle;
        this.storyDescription = storyDescription;
        this.storyPoints = storyPoints;
        this.task = task;
        this.lane = lane;
    }

    @Override
    public String toString() {
        return "Story{" +
                "storyId=" + storyId +
                ", storyTitle='" + storyTitle + '\'' +
                ", storyDescription='" + storyDescription + '\'' +
                ", storyPoints=" + storyPoints +
                ", task=" + task +
                ", lane=" + lane +
                '}';
    }

    public int getStoryId() {
        return storyId;
    }

    public void setStoryId(int storyId) {
        this.storyId = storyId;
    }

    public String getStoryTitle() {
        return storyTitle;
    }

    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle;
    }

    public String getStoryDescription() {
        return storyDescription;
    }

    public void setStoryDescription(String storyDescription) {
        this.storyDescription = storyDescription;
    }

    public int getStoryPoints() {
        return storyPoints;
    }

    public void setStoryPoints(int storyPoints) {
        this.storyPoints = storyPoints;
    }

    public List<Task> getTask() {
        return task;
    }

    public void setTask(List<Task> task) {
        this.task = task;
    }

    public Lane getLane() {
        return lane;
    }

    public void setLane(Lane lane) {
        this.lane = lane;
    }
}
