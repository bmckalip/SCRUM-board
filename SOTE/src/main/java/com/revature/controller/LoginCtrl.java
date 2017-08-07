package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.User;
import com.revature.service.AppService;

/**
 * 
 * @author Adeo
 *
 */

@RestController
//@RequestMapping("/login")
public class LoginCtrl {
	
	@Autowired 
	AppService log;
	
	
	@RequestMapping(value= "/login", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<User> userLogin (@RequestBody User user){
		System.out.println("grabbing burrent user");
		User ureturn = log.getUserByEmail(user);
		if(ureturn != null && ureturn.getUserEmail().equals(user.getUserEmail())

				&& ureturn.getUserPassword().equals(user.getUserPassword())){

			return new ResponseEntity<User>(ureturn, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<User>(HttpStatus.NOT_ACCEPTABLE);
		}
		
	}
	
	

}
