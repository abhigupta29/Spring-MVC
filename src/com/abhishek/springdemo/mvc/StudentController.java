package com.abhishek.springdemo.mvc;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Value("#{countryList}")
	private HashMap<String, String> countryList;
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		//create a student object
		Student student = new Student();
		
		//add student object to the model
		theModel.addAttribute("student",student);
		
		theModel.addAttribute("countryList", countryList);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		System.out.println("First Name:"+ student.getFirstName()
		+" Last Name:" + student.getLastName()
		+" Country:" + student.getCountry());
		
		return "student";
	}
}
