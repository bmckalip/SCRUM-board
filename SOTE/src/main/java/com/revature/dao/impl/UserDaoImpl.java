package com.revature.dao.impl;

import com.revature.dao.UserDao;
import com.revature.pojo.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
    public void updateUser(User user) {
        System.out.println("Updating user - FROM the UserDaoImpl class ");
        Session session = sessionFactory.getCurrentSession();
        session.update(user);
    }

    @Override
    public User getUserById(User user) {
        System.out.println("Retrieving user - FROM the UserDaoImpl class");
        Session session = sessionFactory.getCurrentSession();
        return (User) session.get(User.class, user.getUserId());
    }

    @Override
    public User getUserByEmail(User user) {
        System.out.println("Retrieving user by EMAIL - FROM the UserDaoImpl class");
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class, user.getUserEmail());
        criteria.add(
                Restrictions.like("userEmail", user.getUserEmail())
        );
        return (User) criteria.uniqueResult();
    }

    @Override
    public void deleteUser(User user) {
        System.out.println("Deleting user - FROM the UserDaoImpl class ");
        Session session = sessionFactory.getCurrentSession();
        session.delete(user);
    }
}
