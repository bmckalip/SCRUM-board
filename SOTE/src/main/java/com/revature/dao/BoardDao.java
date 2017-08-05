package com.revature.dao;

import com.revature.pojo.Board;

/**
 * 
 * @author Joseph Nguyen
 *
 */

public interface BoardDao {
	
	//CREATE
	public void createBoard(Board b);
	
	//READ
	public Board getBoardById(Board b);
	
	//UPDATE
	public void changeBoardName(Board b);
	public Board updateBoard(Board board);
	
	//DELETE
	public void deleteBoardById(Board b);

	
}
