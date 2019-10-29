package com.abhishek.springdemo.mvc;

import java.util.HashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String programmingLanguage;
	private String[] operatingSystems;
	
	private HashMap<String,String> countryList;
	
	private HashMap<String,String> programmingLanguageList;
	
	private HashMap<String,String> operatingSystemsList;
	
	public Student() {
		
		countryList = new HashMap<>();
		countryList.put("IN","India");
		countryList.put("BR","Brazil");
		countryList.put("DE","Germany");
		countryList.put("US","United States");
		
		programmingLanguageList = new HashMap<>();
		programmingLanguageList.put("Java","Java");
		programmingLanguageList.put("JavaScript","JavaScript");
		programmingLanguageList.put("CPP","C++");
		
		operatingSystemsList = new HashMap<>();
		operatingSystemsList.put("Windows", "Windows");
		operatingSystemsList.put("Linux", "Linux");
		operatingSystemsList.put("Mac", "Mac");
	}

	public HashMap<String, String> getOperatingSystemsList() {
		return operatingSystemsList;
	}

	public HashMap<String, String> getProgrammingLanguageList() {
		return programmingLanguageList;
	}

	public HashMap<String, String> getCountryList() {
		return countryList;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
}
