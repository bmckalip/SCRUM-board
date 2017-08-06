package com.revature.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.MERGE, fetch=FetchType.EAGER,
        mappedBy = "story", orphanRemoval = true)
    private Set<Task> task = new HashSet<>();

   

	@JsonBackReference
//    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "L_ID")
    private Lane lane;



    public Story(){}

    public Story(String storyTitle, String storyDescription, int storyPoints, Set<Task> task, Lane lane) {
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

    public Set<Task> getTask() {
        return task;
    }

    public void setTask(Set<Task> task) {
        this.task = task;
    }

    @JsonIgnore
    public Lane getLane() {
        return lane;
    }

    public void setLane(Lane lane) {
        this.lane = lane;
    }
    
    public void addTask(Task t){
    	this.task.add(t);
    	t.setStory(this);
    }
    
    @Override
   	public int hashCode() {
   		final int prime = 31;
   		int result = 1;
   		result = prime * result + storyId;
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
   		Story other = (Story) obj;
   		if (storyId != other.storyId)
   			return false;
   		return true;
   	}
}
