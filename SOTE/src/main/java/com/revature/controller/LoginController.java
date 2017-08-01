package com.revature.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	@RequestMapping(method= RequestMethod.GET)
	public String loadLogin(){
		System.out.println("/rest/login GET request hit");
		
		return "/static/features/login/login.html";
	}
}
