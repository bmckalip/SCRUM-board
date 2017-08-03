package com.revature.dao;

import com.revature.pojo.Story;

/**
 * 
 * @author Joseph Nguyen
 *
 */

public interface StoryDao {

	//CREATE
    public void createStory(Story s);
    
    //READ
    public Story getStoryById(Story s);
    
    //UPDATE
    public void changeStoryName(Story s);
    public void changeStoryDescription(Story s);
    public void changeStoryPoints(Story s);
    
    //DELETE
    public void deleteStoryById(Story s);
}
