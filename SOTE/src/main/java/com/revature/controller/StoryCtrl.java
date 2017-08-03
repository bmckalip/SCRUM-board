package com.revature.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
public class StoryCtrl {

	@RequestMapping(value="/save",method= RequestMethod.POST)
	public ResponseEntity<Story> newStory(){
		System.out.println("Saving Object New Story");
		return new ResponseEntity<Story>(HttpStatus.OK);
		

	}
	@RequestMapping(value="/delete",method= RequestMethod.DELETE)
	 public ResponseEntity<Story> deleteStory(@RequestParam("id")int id) {
		System.out.println("Deleting Object Story");
		return new ResponseEntity<Story>(HttpStatus.OK);
		 
		 
	 }
	@RequestMapping(value="/rename",method= RequestMethod.PUT)
	 public ResponseEntity<Story> renameStory(@RequestParam("id") int id, @RequestParam("title")String title){
		 System.out.println("Editing Object Story");
		return new ResponseEntity<Story>(HttpStatus.OK);
	 }
	@RequestMapping(value="/move",method= RequestMethod.PUT)
	  public ResponseEntity<Story> moveStory(@RequestParam("lane_id")int id, @RequestParam("story_id") int Story_Id){
		System.out.println("Moving Object Story");
		return new ResponseEntity<Story>(HttpStatus.OK);

	  }
	@RequestMapping(value="/update",method= RequestMethod.PUT)
	  public ResponseEntity<Story> updateDescription(@RequestParam("id")int id, @RequestParam("description") String description){
		System.out.println("Updating Object Story");
		return new ResponseEntity<Story>(HttpStatus.OK);
		  
	  }
	
}
