package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TabletController {
	
	@RequestMapping(value="tablet", method= {RequestMethod.GET, RequestMethod.POST})
	public String tablet() {
		System.out.println("TabletController.tablet()");
		
		return "";
	}

}
