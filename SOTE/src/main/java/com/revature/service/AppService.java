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
    private TaskDao taskDao;
    @Autowired
    private StoryDao storyDao;
    @Autowired
    private LaneDao laneDao;
    @Autowired
    private BoardDao boardDao;
    @Autowired
    private UserDao userDao;
    @Autowired
    private PermissionDao permissionDao;


    @Transactional
    public void createTask(Task task){
        taskDao.createTask(task);
    }

    @Transactional
    public void createStory(Story story){storyDao.createStory(story);}

    @Transactional
    public void createLane(Lane lane){laneDao.createLane(lane);}

    @Transactional
    public void createBoard(Board board){ boardDao.createBoard(board);}

    @Transactional
    public void createPermission(Permission permission){permissionDao.createPermission(permission);}

    public Task getTaskById(Task task){
        return taskDao.getTaskById(task);
    }
    public Story getStoryById(Story story){ return storyDao.getStoryById(story);}
    public Lane getLaneById(Lane lane){ return laneDao.getLaneById(lane);}
    public Board getBoardById(Board board){
        return boardDao.getBoardById(board);
    }
    public Permission getPermissionById(Permission permission){ return permissionDao.getPermissionById(permission);}




}
