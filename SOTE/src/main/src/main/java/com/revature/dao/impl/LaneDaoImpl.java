package com.revature.dao.impl;

import com.revature.dao.LaneDao;
import com.revature.pojo.Lane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LaneDaoImpl implements LaneDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void createLane(Lane l) {
        Session session = sessionFactory.getCurrentSession();
        session.save(l);
    }

    @Override
    public Lane getLaneById(Lane l) {
        Session session = sessionFactory.getCurrentSession();
        return (Lane) session.get(Lane.class, l.getId());
    }



}
