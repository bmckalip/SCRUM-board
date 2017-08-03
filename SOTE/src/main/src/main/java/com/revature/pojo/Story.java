package com.revature.pojo;

import javax.persistence.*;

@Entity
@Table(name = "story")
public class Story{
    @Id
    @Column(name = "s_id")
    private int storyId;
    @Column(name = "s_title")
    private String storyTitle;
    @Column(name = "s_desc")
    private String storyDescription;
    @Column(name = "s_points")
    private int storyPoints;

    @ManyToOne
    private Lane lane;


    public Story(){}

    public Story(int storyId, String storyTitle, String storyDescription, int storyPoints, Lane lane, Board board) {
        this.storyId = storyId;
        this.storyTitle = storyTitle;
        this.storyDescription = storyDescription;
        this.storyPoints = storyPoints;
        this.lane = lane;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Story)) return false;

        Story story = (Story) o;

        if (getStoryId() != story.getStoryId()) return false;
        if (getStoryPoints() != story.getStoryPoints()) return false;
        if (getStoryTitle() != null ? !getStoryTitle().equals(story.getStoryTitle()) : story.getStoryTitle() != null)
            return false;
        if (getStoryDescription() != null ? !getStoryDescription().equals(story.getStoryDescription()) : story.getStoryDescription() != null)
            return false;
        return getLane() != null ? getLane().equals(story.getLane()) : story.getLane() == null;
    }

    @Override
    public int hashCode() {
        int result = getStoryId();
        result = 31 * result + (getStoryTitle() != null ? getStoryTitle().hashCode() : 0);
        result = 31 * result + (getStoryDescription() != null ? getStoryDescription().hashCode() : 0);
        result = 31 * result + getStoryPoints();
        result = 31 * result + (getLane() != null ? getLane().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Story{" +
                "storyId=" + storyId +
                ", storyTitle='" + storyTitle + '\'' +
                ", storyDescription='" + storyDescription + '\'' +
                ", storyPoints=" + storyPoints +
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

    public Lane getLane() {
        return lane;
    }

    public void setLane(Lane lane) {
        this.lane = lane;
    }


}
