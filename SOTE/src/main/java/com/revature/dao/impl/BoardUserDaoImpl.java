package com.revature.dao.impl;

import com.revature.dao.BoardUserDao;
import com.revature.pojo.BoardUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardUserDaoImpl implements BoardUserDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void createBoardUser(BoardUser boardUser) {
        System.out.println("Creating a BoardUser - FROM The BoardUserImpl class");
        Session session = sessionFactory.getCurrentSession();
        session.save(boardUser);
    }

    @Override
    public BoardUser getBoardUserByUserId(BoardUser boardUser) {
        System.out.println("Creating a BoardUser - FROM The BoardUserImpl class");
        Session session = sessionFactory.getCurrentSession();
        return null;
    }

    @Override
    public void updateBoardUser(BoardUser boardUser) {
        System.out.println("Creating a BoardUser - FROM The BoardUserImpl class");
        Session session = sessionFactory.getCurrentSession();
        session.update(boardUser);
    }

    @Override
    public void deleteBoardUser(BoardUser boardUser) {
        System.out.println("Creating a BoardUser - FROM The BoardUserImpl class");
        Session session = sessionFactory.getCurrentSession();
        session.delete(boardUser);
    }
}
