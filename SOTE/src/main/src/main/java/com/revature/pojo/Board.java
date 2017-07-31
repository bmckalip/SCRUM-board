package com.revature.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="board")
public class Board{

    @Id
    @Column(name="b_id")
    private int boardId;
    @Column(name="b_title")
    private String boardTitle;
    @Column(name = "b_desc")
    private String boardDescription;

    public Board(){}

    public Board(int boardId, String boardTitle, String boardDescription) {
        this.boardId = boardId;
        this.boardTitle = boardTitle;
        this.boardDescription = boardDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Board)) return false;

        Board board = (Board) o;

        if (getBoardId() != board.getBoardId()) return false;
        if (getBoardTitle() != null ? !getBoardTitle().equals(board.getBoardTitle()) : board.getBoardTitle() != null)
            return false;
        return getBoardDescription() != null ? getBoardDescription().equals(board.getBoardDescription()) : board.getBoardDescription() == null;
    }

    @Override
    public int hashCode() {
        int result = getBoardId();
        result = 31 * result + (getBoardTitle() != null ? getBoardTitle().hashCode() : 0);
        result = 31 * result + (getBoardDescription() != null ? getBoardDescription().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardId=" + boardId +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardDescription='" + boardDescription + '\'' +
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
}
