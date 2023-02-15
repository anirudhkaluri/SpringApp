package com.FirstWebApp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	/*
	@RequestMapping("home")
	// @ResponseBody //this says that whatever the function is returning is data
	//but what we want is to return a page
	
	 
	 			public String home(HttpServletRequest req) {
				System.out.println("\n\n\n\n\n\n\nwe are in the home controller\n\n\n\n\n\n\n\n");
		
				String name=req.getParameter("name");
				System.out.println("Hi the name is "+name);
				//now we got the parameter name with us
				//how to send it to home.jsp so that we could display the name parameter?
				//we can use httpSession
				HttpSession session=req.getSession();
				String sessID=session.getId();
				System.out.println("The session ID is "+sessID);
				session.setAttribute("name",name);
				//now lets put it on home.jsp page
				//we inject this into home.jsp by using ${name} in home.jsp just like how we did in Node in EJS engine
				return "home";
				//it will return home.jsp
				//how will dispatcher know where to search for home.jsp?
				//Its autoconfigured that pages are in main/ webapp/
				//jsp is a special type. //When springboot came into picture REST APIs and microservices are more famous
				//The focus is on REST APIs
				//By default spring wont send JSPs. So we add a tomcat-jasper dependency in pom.xml
				//we get that dependency by searching it in mvn repo online
				//Spring will send Response
				// Now let us remove .jsp extension. 
				// also lets change the location of home.jsp from /src/main/webapp/ to /src/main/webapp/pages
		
				}
	 
	 TILL HERE WE USED CONCEPTS WHICH ARE THERE IN SERVLETS WE DIDNT USE CONCEPTS WHICH LEVERAGE THE POWER OF SPRING
	 
	 
	 */
	 
	@RequestMapping("home")
	public String home(String name,HttpSession session) {
		//this is more easier
		//we get the data with key named "name", that will directly be received by the controller
		//also we dont have to create HttpSession object 
		//using dependency injection Spring will directly look for/create a session object associated with the user
		
		session.setAttribute("name", name);
		return "home";
	}
	

}
