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
@Table(name = "lane")
public class Lane{

    @Id
    @SequenceGenerator(name = "seq", sequenceName = "lane_seq")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @Column (name = "l_id")
    private int laneId;

    @Column (name = "l_name", nullable = false)
    private String laneName;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.MERGE, fetch=FetchType.EAGER,
    mappedBy = "lane", orphanRemoval = true)
    private Set<Story> story = new HashSet<>();

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + laneId;
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
		Lane other = (Lane) obj;
		if (laneId != other.laneId)
			return false;
		return true;
	}

	@JsonBackReference
//    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "b_id")
    private Board board;

    public Lane(){}

    public Lane(String laneName, Set<Story> story, Board board) {
        this.laneName = laneName;
        this.story = story;
        this.board = board;
    }

    @Override
    public String toString() {
        return "Lane{" +
                "laneId=" + laneId +
                ", laneName='" + laneName + '\'' +
                ", story=" + story +
                '}';
    }

    public int getLaneId() {
        return laneId;
    }

    public void setLaneId(int laneId) {
        this.laneId = laneId;
    }

    public String getLaneName() {
        return laneName;
    }

    public void setLaneName(String laneName) {
        this.laneName = laneName;
    }

    public Set<Story> getStory() {
        return story;
    }

    public void setStory(Set<Story> story) {
        this.story = story;
    }

    @JsonIgnore
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
    
    public void addStory(Story s){
    	this.story.add(s);
    	s.setLane(this);
    }
}
