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
    public void createLane(Lane lane) {
        System.out.println("Creating a Lane - FROM The LaneDaoImpl class");
        Session session = sessionFactory.getCurrentSession();
        session.save(lane);
    }

    @Override
    public Lane getLaneById(Lane lane) {
        System.out.println("Retrieving a Lane - FROM The LaneDaoImpl class");
        Session session = sessionFactory.getCurrentSession();
        return (Lane) session.get(Lane.class, lane.getLaneId());
    }

    @Override
    public void updateLane(Lane lane) {
        System.out.println("Updating a Lane - FROM The LaneDaoImpl class");
        Session session = sessionFactory.getCurrentSession();
        session.update(lane);
    }

    @Override
    public void deleteLane(Lane lane) {
        System.out.println("Deleting a Lane - FROM The LaneDaoImpl class");
        Session session = sessionFactory.getCurrentSession();
        session.delete(lane);

    }
}
