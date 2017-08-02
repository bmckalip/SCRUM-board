package com.revature.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class ViewHomepageCtrl {

	@RequestMapping(method=RequestMethod.GET)
	public String loadHomepage(){
		return "/static/features/homepage/homepage.html";
	}
}
