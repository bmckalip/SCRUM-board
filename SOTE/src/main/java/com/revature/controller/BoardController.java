package com.revature.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.revature.pojo.Board;

/**
 * 
 * @author Brian McKalip
 *
 */
@RequestMapping("/board")
@Controller
public class BoardController {
	@RequestMapping(value="/new", method=RequestMethod.POST)
	public ResponseEntity<Board> newBoard(@RequestParam("user_id") int user_id, @RequestParam("title") String title){
		//TODO: call service method to create board
		return new ResponseEntity<Board>(HttpStatus.OK);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public ResponseEntity<Board> deleteBoard(@RequestParam("id") int id){
		//TODO: call service method to delete board
		return new ResponseEntity<Board>(HttpStatus.OK);
	}
}
