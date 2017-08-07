package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.revature.pojo.Lane;
import com.revature.service.AppService;

/**
 * 
 * @author Brian McKalip
 *
 */
@RequestMapping("/lane")
@Controller
public class LaneCtrl {
	
	@Autowired
	AppService service;
	
	/**
	 * Creates a new lane
	 * 
	 * @author Dillon Tuck
	 * @param board_id
	 * @param title
	 * @return
	 */
	@RequestMapping(value="/new", method=RequestMethod.POST)
	public ResponseEntity<Lane> newLane(@RequestBody Lane lane){
		System.out.println("hitting /board/new - POST");
		service.saveLane(lane);
	
		return new ResponseEntity<Lane>(HttpStatus.OK);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public ResponseEntity<LaneCtrl> deleteLane(@RequestParam("id") int id){
		//TODO: call service method to delete the lane
		return new ResponseEntity<LaneCtrl>(HttpStatus.OK);
	}
	
	@RequestMapping(value="/rename", method=RequestMethod.POST)
	public ResponseEntity<LaneCtrl> renameLane(@RequestParam("title") String title){
		//TODO: call service method to rename the lane
		return new ResponseEntity<LaneCtrl>(HttpStatus.OK);
	}
}
