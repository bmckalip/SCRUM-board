package com.revature.dao.impl;

import com.revature.dao.ActionDao;
import com.revature.pojo.Action;
import com.revature.pojo.Lane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ActionDaoImpl implements ActionDao{

    @Autowired
    private SessionFactory sessionFactory;
/*
    @Override
    public void createAction(Action action) {
        System.out.println("Creating a Action - FROM The ActionDaoImpl class");
        Session session = sessionFactory.getCurrentSession();
        session.save(action);

    }

    @Override
    public Action getActionById(Action action) {
        System.out.println("Creating a Action - FROM The ActionDaoImpl class");
        Session session = sessionFactory.getCurrentSession();
        return (Action) session.get(Action.class, action.getActionId());
    }
    */
}
