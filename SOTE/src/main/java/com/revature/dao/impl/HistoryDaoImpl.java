package com.revature.dao.impl;

import com.revature.dao.HistoryDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HistoryDaoImpl implements HistoryDao {

    @Autowired
    private SessionFactory sessionFactory;


    /*
    TODO: Implement relevant DAO methods in this class
     */

}
