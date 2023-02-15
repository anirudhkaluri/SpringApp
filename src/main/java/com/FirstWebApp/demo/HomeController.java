package com.FirstWebApp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	
	
	
	/*
	 
	@RequestMapping("home")
	public String home(String name,HttpSession session) {
		//this is more easier
		//we get the data with key named "name", that will directly be received by the controller
		//also we dont have to create HttpSession object 
		//using dependency injection Spring will directly look for/create a session object associated with the user
		
		session.setAttribute("name", name);
		return "home";
	}
	
	HERE WE USED parameter=name exactly. What if I want to use String called myName? we must use
	@RequestParam annotation to map it to myName
	
	public String home(@RequestParam("name") String myName,HttpSession session)
	
	How about skipping HttpSession?
	We are adding data to session object. That data is being used in home.jsp.
	We dont usually use sessions.  Lets use ModelAndView object to make use of the real power of Spring
	
	*/
	
	/*
	
	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String myName) {
		//@RequestParam will map a  parameter named "name" to the String myName in the function argument
		ModelAndView mv=new ModelAndView();
		//you can hold two things 1) model and 2)view
		//now model and view will have two things. 1) data 2) view
		mv.addObject("name",myName);
		//this is data
		//we can add as many number of objects as we want here
		mv.setViewName("home");
		//now we have to pass the view too
		return mv; 
		//why are we able to do this?
		//thats because the Dispatcher servlet will use this mv object to send the jsp file to the client after injecting the data into the view
		
	}
	
	NOW LETS SEE HOW TO GET AN OBJECT AS A PARAMETER TO THE FUNCTION.
	
	*/
	
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		//we will recieve alien object directly when we use URL something like this
		//localhost:8080/home?aid=1234&aname=anirudh&language=java
		//spring will automatically assign the fields in alien to the data which we get into the function parameter object
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj1",alien);
		//we will use obj1 in home.jsp
		//we will comment ${name} since its no longer needed
		mv.setViewName("home");
		//lets change home.jsp
		return mv;
		
	}
	

}
