package com.revature.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewBoardCtrl {

	@RequestMapping(value="/board",method=RequestMethod.GET)
	public String loadBoard(){
		return "/static/features/board/board.html";
	}
}
