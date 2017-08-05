package com.revature.dao;

import com.revature.pojo.Task;

public interface TaskDao {

    //CREATE
    void createTask(Task task);
    //READ
    Task getTaskById(Task task);
    //UPDATE
    void updateTask(Task task);
    //DELETE
    void deleteTask(Task task);

}
