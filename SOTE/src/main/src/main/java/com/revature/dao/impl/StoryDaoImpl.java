package com.revature.dao.impl;

import com.revature.dao.StoryDao;
import com.revature.pojo.Story;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StoryDaoImpl implements StoryDao{


    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void createStory(Story s) {
        Session session = sessionFactory.getCurrentSession();
        session.save(s);
    }

    @Override
    public Story getStoryById(Story s) {
        Session session = sessionFactory.getCurrentSession();
        return (Story) session.get(Story.class, s.getId());
    }
}
