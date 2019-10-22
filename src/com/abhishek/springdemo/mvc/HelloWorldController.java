package com.abhishek.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
