package com.revature.dao;

import com.revature.pojo.Task;

public interface TaskDao {

    public void createTask(Task t);
    public Task getTaskById(Task t);
}
