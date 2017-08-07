package com.revature.dao;

import java.util.Set;

import com.revature.pojo.Board;

public interface BoardDao {

	//CREATE
	public void createBoard(Board b);
	
	//READ
    public Board getBoardById(Board board);
    public Set<Board> getAllBoards();
	
	//UPDATE
	public void changeBoardName(Board b);
	public Board updateBoard(Board board);
	
	//DELETE
	public void deleteBoardById(Board b);
	void deleteBoard(Board board);

	
}
