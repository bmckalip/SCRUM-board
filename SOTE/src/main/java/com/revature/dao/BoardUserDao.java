package com.revature.dao;

import com.revature.pojo.BoardUser;
import org.springframework.stereotype.Repository;

public interface BoardUserDao {

    //CREATE
    void createBoardUser(BoardUser boardUser);
    //READ
    BoardUser getBoardUserByUserId(BoardUser boardUser);
    //UPDATE
    void updateBoardUser(BoardUser boardUser);
    //DELETE
    void deleteBoardUser(BoardUser boardUser);

}
