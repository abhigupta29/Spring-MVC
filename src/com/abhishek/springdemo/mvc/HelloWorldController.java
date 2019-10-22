package com.abhishek.springdemo.mvc;

import org.springframework.stereotype.Controller;
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
}
