package com.revature.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewHomepageCtrl {

	@RequestMapping(value="/home", method=RequestMethod.GET)
	@ResponseBody
	public String loadHomepage(){
		System.out.println("home view controller");
		return "static/features/home/home.html";
	}
}
