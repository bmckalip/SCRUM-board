package com.revature.dao.impl;

import com.revature.dao.BoardDao;
import com.revature.pojo.Board;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDaoImpl implements BoardDao{


	    @Autowired

	    private SessionFactory sessionFactory;



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

	    public void updateBoard(Board board) {

	        System.out.println("Updating a board - FROM the BoardDaoImpl class");

	        Session session = sessionFactory.getCurrentSession();

	        session.update(board);

	    }



	    @Override

	    public void deleteBoardById(Board board) {

	        System.out.println("Deleting a board - FROM the BoardDaoImpl class");

	        Session session = sessionFactory.getCurrentSession();

	        session.delete(board);

	    }

}
