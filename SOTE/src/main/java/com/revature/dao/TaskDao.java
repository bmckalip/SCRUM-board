package com.revature.dao;

import com.revature.pojo.Task;

public interface TaskDao {

    void createTask(Task task);
    Task getTaskById(Task task);

}
