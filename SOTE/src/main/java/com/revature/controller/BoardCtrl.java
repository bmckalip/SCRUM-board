package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.Board;
import com.revature.service.AppService;

/**
 * 
 * @author Brian McKalip
 *
 */


@RestController
@RequestMapping("/board")
public class BoardCtrl {
	
	@Autowired
	AppService service;
//	
//	@RequestMapping(value="/new", method=RequestMethod.POST)
//	public ResponseEntity<Board> newBoard(@RequestParam("user_id") int user_id, @RequestParam("title") String title){
//		//TODO: call service method to create board
//		return new ResponseEntity<Board>(HttpStatus.OK);
//	}
//	
//	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
//	public ResponseEntity<Board> deleteBoard(@RequestParam("id") int id){
//		//TODO: call service method to delete board
//		return new ResponseEntity<Board>(HttpStatus.OK);
//	}
	
	/**
	 * @author Dillon Tuck
	 * 
	 */
   @RequestMapping(value = "/{id}", method=RequestMethod.GET)
   public Board findOne(@PathVariable("id") int id) {
	   System.out.println("hitting body/"+id+" controller");
	   Board board = service.getBoardById(id);
	   System.out.println(board);
       return board;
   }
}
