package com.revature.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "boardusers")
public class BoardUser implements Serializable{

    @EmbeddedId
    private BoardUserCompositeKey boardUserCompositeKey;

    public BoardUser(){}

    public BoardUser(BoardUserCompositeKey boardUserCompositeKey) {
        this.boardUserCompositeKey = boardUserCompositeKey;
    }

    public BoardUserCompositeKey getBoardUserCompositeKey() {
        return boardUserCompositeKey;
    }

    public void setBoardUserCompositeKey(BoardUserCompositeKey boardUserCompositeKey) {
        this.boardUserCompositeKey = boardUserCompositeKey;
    }

    @Override
    public String toString() {
        return "BoardUser{" +
                "boardUserCompositeKey=" + boardUserCompositeKey +
                '}';
    }
}
