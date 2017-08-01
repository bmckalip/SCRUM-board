package com.revature.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Brian McKalip
 *
 */
@RequestMapping("/board")
@ResponseBody
@RestController
public class BoardController {
	
	@RequestMapping(value="/new", method=RequestMethod.POST)
	public void newBoard(@RequestParam("user_id") int user_id, @RequestParam("title") String title){
		//TODO: call service method to create board
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public void deleteBoard(@RequestParam("id") int id){
		//TODO: call service method to delete board
	}
	
}
