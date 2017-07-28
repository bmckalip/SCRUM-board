package com.revature.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lane")
public class Lane{

    @Id
    @Column (name = "l_id")
    private int laneId;
    @Column (name = "l_name")
    private String laneName;
    private Board board;

    public Lane(){}

    public Lane(int laneId, String laneName, Board board) {
        this.laneId = laneId;
        this.laneName = laneName;
        this.board = board;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lane)) return false;

        Lane lane = (Lane) o;

        if (getLaneId() != lane.getLaneId()) return false;
        if (getLaneName() != null ? !getLaneName().equals(lane.getLaneName()) : lane.getLaneName() != null)
            return false;
        return getBoard() != null ? getBoard().equals(lane.getBoard()) : lane.getBoard() == null;
    }

    @Override
    public int hashCode() {
        int result = getLaneId();
        result = 31 * result + (getLaneName() != null ? getLaneName().hashCode() : 0);
        result = 31 * result + (getBoard() != null ? getBoard().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Lane{" +
                "laneId=" + laneId +
                ", laneName='" + laneName + '\'' +
                ", board=" + board +
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

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
