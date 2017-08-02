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
    public void createStory(Story story) {
        System.out.println("Creating a Story - FROM The StoryDaoImpl class");
        Session session = sessionFactory.getCurrentSession();
        session.save(story);

    }

    @Override
    public Story getStoryById(Story story) {
        System.out.println("Creating a Story - FROM The LaneDaoImpl class");
        Session session = sessionFactory.getCurrentSession();
        return (Story) session.get(Story.class, story.getStoryId());
    }

    @Override
    public void updateStory(Story story) {
        System.out.println("Updating a Permission - FROM The PermissionDaoImpl class");
        Session session = sessionFactory.getCurrentSession();
        session.update(story);

    }

    @Override
    public void deleteStory(Story story) {
        System.out.println("Deleting a Permission - FROM The PermissionDaoImpl class");
        Session session = sessionFactory.getCurrentSession();
        session.delete(story);

    }



}
