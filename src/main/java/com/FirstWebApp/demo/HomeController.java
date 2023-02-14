package com.FirstWebApp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	// @ResponseBody //this says that whatever the function is returning is data
	//but what we want is to return a page
	public String home() {
		System.out.println("\n\n\n\n\n\n\nwe are in the home controller\n\n\n\n\n\n\n\n");
		return "home";
		//it will return home.jsp
		//how will dispatcher know where to search for home.jsp?
		//In the config file its already written that pages are in main/ webapp
		//jsp is a special type. //When springboot came into picture REST APIs and microservices are more famous
		//The focus is on REST APIs
		//By default spring wont send JSPs
		//Spring will send Response
		// Now let us remove .jsp extension. 
		
	}

}
