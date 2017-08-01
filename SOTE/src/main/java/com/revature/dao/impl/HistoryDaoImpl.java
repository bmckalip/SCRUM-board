package com.revature.dao.impl;

import com.revature.dao.HistoryDao;
import com.revature.pojo.History;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HistoryDaoImpl implements HistoryDao {

    @Autowired
    private SessionFactory sessionFactory;
/*
    @Override
    public void createHistory(History history) {
        System.out.println("Creating a History - FROM The HistoryDaoImpl class");
        Session session = sessionFactory.getCurrentSession();
        session.save(history);

    }

    @Override
    public History getHistoryById(History history) {
        System.out.println("Retrieving a Action - FROM The HistoryDaoImpl class");
        Session session = sessionFactory.getCurrentSession();
        return (History) session.get(History.class, history.getHistoryId());
    }
    */
}
