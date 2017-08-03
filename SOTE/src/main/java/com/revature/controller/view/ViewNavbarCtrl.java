package com.revature.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewNavbarCtrl {
	
	@RequestMapping(value="/navbar", method=RequestMethod.GET)
	public String loadNavbar(){
		return "/static/features/navbar/navbar.html";
	}
}
