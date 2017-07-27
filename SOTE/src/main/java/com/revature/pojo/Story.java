package com.revature.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "story")
public class Story implements Serializable {

    @Id
    @Column(name = "s_id")
    private int id;
    @Column(name = "s_title")
    private String name;
    @Column(name = "s_desc")
    private String description;
    @Column(name = "s_points")
    private int points;
    @Column(name = "l_id")
    private int laneId;
    @Column(name = "b_id")
    private int boardId;

    public void setLane(Lane lane) {
        this.lane = lane;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    private Lane lane;
    private Board board;

    Story(){}

    Story(int id, String name, String description, int points, int laneId, int boardId){
        this.id = id;
        this.name = name;
        this.description = description;
        this.points = points;
        this.laneId = laneId;
        this.boardId = boardId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getLaneId() {
        return laneId;
    }

    public void setLaneId(int laneId) {
        this.laneId = laneId;
    }

    public int getBoardId() {
        return boardId;
    }

    @Override
    public String toString() {
        return "Story{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", points=" + points +
                ", laneId=" + laneId +
                ", boardId=" + boardId +
                ", lane=" + lane +
                ", board=" + board +
                '}';
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "l_id")
    public Lane getLane(){
        return lane;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "b_id")
    public Board getBoard(){
        return board;
    }

}
