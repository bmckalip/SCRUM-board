package com.revature.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author Brian McKalip
 *
 */
@RequestMapping("/lane")
@ResponseBody
@Controller
public class Lane {
	
	@RequestMapping(value="/new", method=RequestMethod.POST)
	public void newLane(@RequestParam("board_id") int board_id, @RequestParam("title") String title){
		//TODO: call service method to create the lane
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public void deleteLane(@RequestParam("id") int id){
		//TODO: call service method to delete the lane
	}
	
	@RequestMapping(value="/rename", method=RequestMethod.POST)
	public void deleteLane(@RequestParam("title") String title){
		//TODO: call service method to rename the lane
	}
}
