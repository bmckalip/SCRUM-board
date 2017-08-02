package com.revature.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/navbar")
public class NavbarCtrl {
	
	@RequestMapping(method=RequestMethod.GET)
	public String loadNavbar(){
		return "/static/features/navbar/navbar.html";
	}
}
