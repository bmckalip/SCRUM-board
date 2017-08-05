package com.revature.dao;

import com.revature.pojo.Story;

public interface StoryDao {

    //CREATE
    void createStory(Story story);
    //READING
    Story getStoryById(Story story);
    //UPDATE
    void updateStory(Story story);
    //DELETE
    void deleteStory(Story story);

}
