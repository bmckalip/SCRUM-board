package com.revature.dao;

import com.revature.pojo.Board;

import java.util.ArrayList;

public interface BoardUserCKDao {

    ArrayList<Board> getBoardsByUserId(int userId);
}
