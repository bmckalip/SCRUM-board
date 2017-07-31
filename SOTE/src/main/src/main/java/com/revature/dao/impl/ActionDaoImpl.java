package com.revature.dao.impl;

import com.revature.dao.ActionDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ActionDaoImpl implements ActionDao{
    @Autowired
    private SessionFactory sessionFactory;

    /*
    TODO: Implement relevant DAO methods in this class
     */
}
