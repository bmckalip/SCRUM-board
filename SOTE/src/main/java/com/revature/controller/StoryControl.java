package com.revature.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.pojo.Story;


/**
 * 
 * @author Adeo
 *
 */
@Controller
@RequestMapping("/story")
@ResponseBody
@RestController
public class StoryControl {

	@RequestMapping(value="/save",method= RequestMethod.POST)
	public ResponseEntity<Story> newStory(){
		System.out.println("Saving Object New Story");
		return new ResponseEntity<Story>(HttpStatus.OK);
		

	}
	@RequestMapping(value="/delete",method= RequestMethod.DELETE)
	 public ResponseEntity<Story> deleteStory() {
		System.out.println("Deleting Object Story");
		return new ResponseEntity<Story>(HttpStatus.OK);
		 
		 
	 }
	@RequestMapping(value="/rename",method= RequestMethod.PUT)
	 public ResponseEntity<Story> renameStory(){
		 System.out.println("Editing Object Story");
		return new ResponseEntity<Story>(HttpStatus.OK);
	 }
	@RequestMapping(value="/move",method= RequestMethod.PUT)
	  public void moveStory(@RequestParam("lane_id")int id){
		System.out.println("Moving Object Story");
		  
	  }
	@RequestMapping(value="/update",method= RequestMethod.PUT)
	  public ResponseEntity<Story> updateDescription(){
		System.out.println("Updating Object Story");
		return new ResponseEntity<Story>(HttpStatus.OK);
		  
	  }
	@RequestMapping(value="/save",method= RequestMethod.POST)
		public ResponseEntity<Story> NewTask(){
		System.out.println("Saving Object New task");
			return new ResponseEntity<Story>(HttpStatus.OK);

		}

	@RequestMapping(value="/delete",method= RequestMethod.DELETE)
	  public ResponseEntity<Story> deleteTask(){
		  System.out.println("Deleting Object Task");
		return new ResponseEntity<Story>(HttpStatus.OK);
	  }
	@RequestMapping(value="/update",method= RequestMethod.PUT)
	  public ResponseEntity<Story> editTask(){
		  System.out.println("Updating Object Task");
		return new ResponseEntity<Story>(HttpStatus.OK);
	  }
}
