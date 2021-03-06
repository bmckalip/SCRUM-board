package com.revature.dao.impl;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.dao.BoardDao;
import com.revature.pojo.Board;

@Repository
public class BoardDaoImpl implements BoardDao{

    @Autowired
    private SessionFactory sessionFactory;

	@Override
	public void changeBoardName(Board b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoardById(Board b) {
		// TODO Auto-generated method stub
		
	}

    @Override
    public void createBoard(Board board) {
        System.out.println("Creating a board - FROM the BoardDaoImpl class");
        Session session = sessionFactory.getCurrentSession();
        session.save(board);
    }

    @Override
    public Board getBoardById(Board board) {
        System.out.println("Creating a board - FROM the BoardDaoImpl class");
        Session session = sessionFactory.getCurrentSession();
        return (Board) session.get(Board.class, board.getBoardId());
    }
    
	@Override
	public Board updateBoard(Board board) {
		Session session = sessionFactory.getCurrentSession();
		session.update(board);
		return board;
	}

    @Override
    public void deleteBoard(Board board) {
        System.out.println("Deleting a board - FROM the BoardDaoImpl class");
        Session session = sessionFactory.getCurrentSession();
        session.delete(board);
    }

	@Override
	public Set<Board> getAllBoards() {
		Session session = sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(Board.class);
		
		Set<Board> boardSet = new HashSet<>(crit.list());
		
		return boardSet;
	}

}
