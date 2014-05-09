package com.gomei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StarController{

	@RequestMapping(value="/signedStar", method=RequestMethod.GET)
	public String index(Model model){
		System.out.println("enter signedStar");
		model.addAttribute("hello", "hello world");
		return "index";
	}

}
