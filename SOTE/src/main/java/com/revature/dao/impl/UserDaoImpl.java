package com.revature.dao.impl;

import com.revature.dao.UserDao;
import com.revature.pojo.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void createUser(User user) {
        System.out.println("Creating user - FROM the UserDaoImpl class ");
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }

    @Override
    public User getUserById(User user) {
        System.out.println("Retrieving user - FROM the UserDaoImpl class");
        Session session = sessionFactory.getCurrentSession();
        return (User) session.get(User.class, user.getUserId());
    }
}
