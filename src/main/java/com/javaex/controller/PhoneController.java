package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PhoneController {
	
	@RequestMapping(value="login", method= {RequestMethod.GET, RequestMethod.POST})
	public String login() {
		System.out.println("PhoneController.login()");
		
		return "";
	}

}
