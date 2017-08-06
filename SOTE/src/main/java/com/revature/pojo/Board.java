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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="board")
public class Board{

    @Id
    @SequenceGenerator(name = "seq", sequenceName = "board_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @Column(name="b_id")
    private int boardId;

    @Column(name="b_title")
    private String boardTitle;

    @Column(name = "b_desc")
    private String boardDescription;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.MERGE, fetch=FetchType.EAGER,
        mappedBy = "board", orphanRemoval = true)
    private Set<Lane> lane = new HashSet<>();

    public Board(){}

    public Board(String boardTitle, String boardDescription, Set<Lane> lane) {
        this.boardTitle = boardTitle;
        this.boardDescription = boardDescription;
        this.lane = lane;
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardId=" + boardId +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardDescription='" + boardDescription + '\'' +
                ", lane=" + lane +
                '}';
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardDescription() {
        return boardDescription;
    }

    public void setBoardDescription(String boardDescription) {
        this.boardDescription = boardDescription;
    }

    public Set<Lane> getLane() {
        return lane;
    }

    public void setLane(Set<Lane> lane) {
        this.lane = lane;
    } 
    
    public void addLane(Lane l){
    	this.lane.add(l);
    	l.setBoard(this);
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + boardId;
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
		Board other = (Board) obj;
		if (boardId != other.boardId)
			return false;
		return true;
	}
}
