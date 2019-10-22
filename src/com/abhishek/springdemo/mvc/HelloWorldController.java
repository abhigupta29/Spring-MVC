package com.abhishek.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/helloWorldForm")
	public String helloWorldForm() {
		return "helloWorld-form";
	}
	
	@RequestMapping("/helloWorld")
	public String helloWorld() {
		return "helloWorld";
	}
	
	@RequestMapping("/helloWorldVerion2")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		String theName = request.getParameter("studentName");
		theName = theName.toUpperCase();
		String result = "YO! "+ theName;
		model.addAttribute("message", result);
		
		return "helloWorld";
	}
	
	@RequestMapping("/helloWorldVerion3")
	public String helloWorldVersion3(@RequestParam("studentName") String theName, Model model) {
		
		theName = theName.toUpperCase();
		String result = "Hello friend from v3! "+ theName;
		model.addAttribute("message", result);
		
		return "helloWorld";
	}
}
