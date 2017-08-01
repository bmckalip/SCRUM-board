package com.revature.dao;

import com.revature.pojo.Board;

public interface BoardDao {

    void createBoard(Board board);
    Board getBoardById(Board board);
}
