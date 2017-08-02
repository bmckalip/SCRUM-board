package com.revature.dao;

import com.revature.pojo.Task;

/**
 * 
 * @author Joseph Nguyen
 *
 */

public interface TaskDao {

	//CREATE
    public void createTask(Task t);
    
    //READ
    public Task getTaskById(Task t);
    
    //UPDATE
    public void changeTaskDescription(Task t);
    public void changeTaskStatus(Task t);
    
    //DELETE
    public void deleteTaskById(Task t);
}
