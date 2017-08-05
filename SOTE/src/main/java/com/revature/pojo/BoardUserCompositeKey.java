package com.revature.pojo;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class BoardUserCompositeKey implements Serializable {

    @ManyToOne
    @JoinColumn(name = "B_ID")
    private Board board;

    @ManyToOne
    @JoinColumn(name = "U_ID")
    private User user;

    public BoardUserCompositeKey(){}

    public BoardUserCompositeKey(Board board, User user) {
        this.board = board;
        this.user = user;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "BoardUserCompositeKey{" +
                "board=" + board +
                ", user=" + user +
                '}';
    }
}
