package com.revature.service;

import com.revature.dao.*;
import com.revature.pojo.*;
import org.hibernate.annotations.AttributeAccessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value="AppService")
@Transactional
public class AppService {

    @Autowired
    private BoardDao boardDao;

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
    public void saveUser(User user){ userDao.createUser(user);}

    @Transactional
    public void updateUser(User user){userDao.updateUser(user);}

    @Transactional
    public void saveTask(Task task){taskDao.createTask(task);}

    @Transactional
    public void updateTask(Task task){taskDao.updateTask(task);}

    @Transactional
    public void saveStory(Story story){storyDao.createStory(story);}

    @Transactional
    public void updateStory(Story story){storyDao.updateStory(story);}

    @Transactional
    public void savePermission(Permission permission){permissionDao.createPermission(permission);}

    @Transactional
    public void updatePermission(Permission permission){permissionDao.updatePermission(permission);}

    @Transactional
    public void saveLane(Lane lane){laneDao.createLane(lane);}

    @Transactional
    public void updateLane(Lane lane){laneDao.updateLane(lane);}

    @Transactional
    public void saveBoard(Board board){boardDao.createBoard(board);}

    @Transactional
    public void updateBoard(Board board){boardDao.updateBoard(board);}


    public User getUserById(User user){ return userDao.getUserById(user);}
    public User getUserByEmail(User user){ return userDao.getUserByEmail(user);}
    public Board getBoardById(Board board){return boardDao.getBoardById(board);}
    public Permission getPermissionById(Permission permission){return permissionDao.getPermissionById(permission);}
    public Lane getLaneById(Lane lane){return laneDao.getLaneById(lane);}
    public Task getTaskById(Task task){return taskDao.getTaskById(task);}
    public Story getStoryById(Story story){return storyDao.getStoryById(story);}

}
