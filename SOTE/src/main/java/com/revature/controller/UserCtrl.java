package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.User;
import com.revature.service.AppService;

@RestController
@RequestMapping("/user")

public class UserCtrl {
	
	@Autowired
	AppService service;
	
	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	   public User UserOne(@PathVariable("id") int id) {
		   System.out.println("hitting body/"+id+" controller");
		   User user = new User(); //ADDED
		   user.setUserId(id); //ADDED
		   User use = service.getUserById(user); //MODIFIED
		   System.out.println(use);
	       return use;
	   }
}
