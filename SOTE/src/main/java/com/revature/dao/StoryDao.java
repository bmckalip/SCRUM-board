package com.revature.dao;

import com.revature.pojo.Story;

public interface StoryDao {

    void createStory(Story story);
    Story getStoryById(Story story);
}
