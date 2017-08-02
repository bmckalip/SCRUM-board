package com.revature.dao.impl;

import com.revature.dao.TaskDao;
import com.revature.pojo.Task;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Joseph Nguyen
 *
 */

@Repository
public class TaskDaoImpl implements TaskDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void createTask(Task t) {
        Session session = sessionFactory.getCurrentSession();
        session.save(t);
    }

    @Override
    public Task getTaskById(Task t) {
        Session session = sessionFactory.getCurrentSession();
        return (Task) session.get(Task.class, t.getId());
    }

	@Override
	public void changeTaskDescription(Task t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeTaskStatus(Task t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTaskById(Task t) {
		// TODO Auto-generated method stub
		
	}
}
