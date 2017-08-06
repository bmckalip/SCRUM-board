package com.revature.pojo;

import java.util.ArrayList;
import java.util.List;

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
    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER,
        mappedBy = "board", orphanRemoval = true)
    private List<Lane> lane = new ArrayList<>();

    public Board(){}

    public Board(String boardTitle, String boardDescription, List<Lane> lane) {
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

    public List<Lane> getLane() {
        return lane;
    }

    public void setLane(List<Lane> lane) {
        this.lane = lane;
    } 
    
    public void addLane(Lane l){
    	this.lane.add(l);
    	l.setBoard(this);
    }
}
