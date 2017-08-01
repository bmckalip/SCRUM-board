package com.revature.dao;

import com.revature.pojo.Lane;

public interface LaneDao {

    void createLane(Lane lane);
    Lane getLaneById(Lane lane);
}
