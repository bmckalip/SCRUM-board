package com.revature.dao;

import com.revature.pojo.Lane;

/**
 * 
 * @author Joseph Nguyen
 *
 */

public interface LaneDao {

	//CREATE
    public void createLane(Lane l);
    
    //READ
    public Lane getLaneById(Lane l);
    
    //UPDATE
    public void changeLaneName(Lane l);
    
    //DELETE
    public void deleteLaneById(Lane l);
}
