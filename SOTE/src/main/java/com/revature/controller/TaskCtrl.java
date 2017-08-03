package com.revature.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



/**
 * 
 * @author Adeo
 * 
 */

import com.revature.pojo.Story;
@Controller
@RequestMapping("/task")
@ResponseBody
@RestController
public class TaskCtrl {

	@RequestMapping(value="/save",method= RequestMethod.POST)
	public ResponseEntity<Story> NewTask(){
	System.out.println("Saving Object New task");
		return new ResponseEntity<Story>(HttpStatus.OK);

	}

@RequestMapping(value="/delete",method= RequestMethod.DELETE)
  public ResponseEntity<Story> deleteTask(@RequestParam("id") int id){
	  System.out.println("Deleting Object Task");
	return new ResponseEntity<Story>(HttpStatus.OK);
  }
@RequestMapping(value="/update",method= RequestMethod.PUT)
  public ResponseEntity<Story> editTask(){
	  System.out.println("Updating Object Task");
	return new ResponseEntity<Story>(HttpStatus.OK);
  }
}
