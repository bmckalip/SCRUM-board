package com.revature.service;

import com.revature.dao.*;
import com.revature.pojo.*;
import org.hibernate.annotations.AttributeAccessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//@Transactional
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
    
    /**
     * @author Dillon Tuck
     */
	public Board getBoardById(int id) {
		
//		Board userBoard = new Board();
//		userBoard.setId(id);
//		
//		return boardDao.getBoardById(userBoard);
		
		return new Board(id, "Hardcoded Board", "This board is for test purposes");
	}
}
