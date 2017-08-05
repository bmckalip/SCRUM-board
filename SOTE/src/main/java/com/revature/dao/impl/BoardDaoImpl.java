package com.revature.dao.impl;

import com.revature.dao.BoardDao;
import com.revature.pojo.Board;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Joseph Nguyen
 *
 */

@Repository
public class BoardDaoImpl implements BoardDao{

    @Autowired
    private SessionFactory sessionFactory;

	@Override
	public void createBoard(Board b) {
		Session session = sessionFactory.getCurrentSession();
		session.save(b);
	}

	@Override
	public Board getBoardById(Board b) {
		System.out.println("in getBoardById(Board b)");
		Session session = sessionFactory.getCurrentSession();
		return (Board) session.get(Board.class, b.getId());
	}

	@Override
	public void changeBoardName(Board b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoardById(Board b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Board updateBoard(Board board) {
		Session session = sessionFactory.getCurrentSession();
		session.update(board);
		return board;
	}

}
