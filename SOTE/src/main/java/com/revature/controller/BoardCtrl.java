package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	/**
	 * Post request for creating a new board. takes in JSON object like:
	 * {"id": int id, "name" : "String name", "description" : "String description"}
	 * 
	 * @author Dillon Tuck
	 * @param board
	 * @return
	 */
	@RequestMapping(value="/new", method=RequestMethod.POST)
	public ResponseEntity<Board> newBoard(@RequestBody Board board){
		System.out.println("hitting /board/new - POST");
		service.saveBoard(board);
	
		return new ResponseEntity<Board>(HttpStatus.OK);
	}
//	
//	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
//	public ResponseEntity<Board> deleteBoard(@RequestParam("id") int id){
//		//TODO: call service method to delete board
//		return new ResponseEntity<Board>(HttpStatus.OK);
//	}
	
	/**
	 * @author Dillon Tuck
	 * 
	 * incomplete
	 */
   @RequestMapping(value = "/{id}", method=RequestMethod.PUT)
   public Board findOne(@PathVariable("id") int id, @RequestBody Board board) {
	   System.out.println("hitting board/"+id+" controller - PUT");
	   System.out.println("board before update:" + board);
	   board = service.updateBoard(id, board);
	   
	   System.out.println("board after update:" + board);
	   
       return board;
   }
	
	/**
	 * @author Dillon Tuck
	 * 
	 */
   @RequestMapping(value = "/{id}", method=RequestMethod.GET)
   public Board findOne(@PathVariable("id") int id) {
	   System.out.println("hitting body/"+id+" controller");
	   Board testBoard = new Board(); //ADDED
	   testBoard.setBoardId(id); //ADDED
	   Board board = service.getBoardById(testBoard); //MODIFIED
	   System.out.println(board);
       return board;
   }
}
