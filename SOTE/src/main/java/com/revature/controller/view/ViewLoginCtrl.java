package com.revature.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewLoginCtrl {
	
	@RequestMapping(value="/login", method= RequestMethod.GET)
	public String loadLogin(){
		System.out.println("/rest/login GET request hit");
		
		return "/static/features/login/login.html";
	}
}
