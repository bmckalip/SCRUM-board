package com.revature.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @author Brian McKalip
 *
 */
@RequestMapping("/lane")
@Controller
public class Lane {
	
	@RequestMapping(value="/new", method=RequestMethod.POST)
	public ResponseEntity<Lane> newLane(@RequestParam("board_id") int board_id, @RequestParam("title") String title){
		//TODO: call service method to create the lane
		return new ResponseEntity<Lane>(HttpStatus.OK);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public ResponseEntity<Lane> deleteLane(@RequestParam("id") int id){
		//TODO: call service method to delete the lane
		return new ResponseEntity<Lane>(HttpStatus.OK);
	}
	
	@RequestMapping(value="/rename", method=RequestMethod.POST)
	public ResponseEntity<Lane> deleteLane(@RequestParam("title") String title){
		//TODO: call service method to rename the lane
		return new ResponseEntity<Lane>(HttpStatus.OK);
	}
}
