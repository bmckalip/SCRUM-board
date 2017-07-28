package com.revature.service;

import com.revature.dao.*;
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

}
