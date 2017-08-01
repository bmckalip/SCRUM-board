package com.revature.pojo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(cascade = CascadeType.ALL,
    mappedBy = "lane", orphanRemoval = true)
    private List<Story> story = new ArrayList<>();

    @ManyToOne
    private Board board;

    public Lane(){}

    public Lane(String laneName, List<Story> story, Board board) {
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

    public List<Story> getStory() {
        return story;
    }

    public void setStory(List<Story> story) {
        this.story = story;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
