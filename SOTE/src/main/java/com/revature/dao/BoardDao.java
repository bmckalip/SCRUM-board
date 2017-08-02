package com.revature.dao;

import com.revature.pojo.Board;

public interface BoardDao {

    //CREATE
    void createBoard(Board board);
    //READ
    Board getBoardById(Board board);
    //UPDATE
    void updateBoard(Board board);
    //DELETE
    void deleteBoardById(Board board);
}
