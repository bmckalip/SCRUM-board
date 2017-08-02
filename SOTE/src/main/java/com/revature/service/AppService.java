package com.revature.service;

import com.revature.dao.*;
import com.revature.dao.impl.UserDaoImpl;
import com.revature.pojo.*;
import org.hibernate.annotations.AttributeAccessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value="AppService")
public class AppService {
    @Autowired
    private ActionDao actionDao;
    @Autowired
    private BoardDao boardDao;
    @Autowired
    private BoardUserDao boardUserDao;
    @Autowired
    private HistoryDao historyDao;
    @Autowired
    private LaneDao laneDao;
    @Autowired
    private PermissionDao permissionDao;
    @Autowired
    private StoryDao storyDao;
    @Autowired
    private TaskDao taskDao;
    @Autowired
    private UserDao userDao;

    @Transactional
    public void saveTask(Task t){
        taskDao.createTask(t);
    }
    @Transactional
    public void saveLane(Lane l){
        laneDao.createLane(l);
    }
    @Transactional
    public void saveStory(Story s){
        storyDao.createStory(s);
    }

    public Task getTaskById(Task t){
        return taskDao.getTaskById(t);
    }
    public Lane getLaneById(Lane l){
        return laneDao.getLaneById(l);
    }
    public Story getStoryById(Story s){
        return storyDao.getStoryById(s);
    }
    
    public User getUserById(User user){ return userDao.getUserById(user);}
    
    public User getUserByEmail(User user) { return userDao.getUserByEmail(user);}

    public class Service {
    	private UserDao dao = new UserDaoImpl();
    	public User authenticateUser(User user){
    		UserDao dao = new UserDaoImpl();
    		User TrUser = dao.getUserByEmail(user);
    		
    		if(TrUser != null && TrUser.getUserEmail().equals(user.getUserEmail())
    				&& TrUser.getUserPassword().equals(user.getUserPassword())){
    			return TrUser;
    		}
			return user;
    		
    		
    	}
    }
}
