package com.revature.dao;

import com.revature.pojo.Lane;

public interface LaneDao {

    //CREATE
    void createLane(Lane lane);

    //READ
    Lane getLaneById(Lane lane);

    //UPDATE
    void updateLane(Lane lane);

    //DELETE
    void deleteLaneById(Lane lane);
}
