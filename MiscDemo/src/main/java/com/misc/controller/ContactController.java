package com.misc.controller;



import org.springframework.boot.ApplicationArguments;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	
	/*  Path Variables type  */
	@GetMapping(value="/contact/v1", produces = MediaType.APPLICATION_JSON_VALUE)
	public Contact1 getContactDetails1() {
		return new Contact1("Sandhu", 23);
	}
	
	@GetMapping(value="/contact/v2", produces = MediaType.APPLICATION_JSON_VALUE)
	public Contact2 getContactDetails2() {
		return new Contact2("Sandhu", 23);
	}
     
	/*  Request Params  */
	@GetMapping(value="/contact", produces = MediaType.APPLICATION_JSON_VALUE, params = "version=v1")
	public Contact1 getContactDetailsQuery1() {
		return new Contact1("Sandhu", 23);
	}
	
	@GetMapping(value="/contact", produces = MediaType.APPLICATION_JSON_VALUE, params = "version=v2")
	public Contact2 getContactDetailsQuery2() {
		return new Contact2("Sandhu", 23);
	}
	
	/*  Header Params  */
	@GetMapping(value="/contact", produces = MediaType.APPLICATION_JSON_VALUE, headers = "version=v1")
	public Contact1 getContactDetailsHeader1() {
		return new Contact1("Sandhu", 23);
	}
	
	@GetMapping(value="/contact", produces = MediaType.APPLICATION_JSON_VALUE, headers = "version=v2")
	public Contact2 getContactDetailsHeader2() {
		return new Contact2("Sandhu", 23);
	}
	
	/*  Content Negotation  */
	
	@GetMapping(value="/contact", produces = "application/content.v1+json")
	public Contact1 getContactDetailsContent1() {
		return new Contact1("Sandhu", 23);
	}
	
	@GetMapping(value="/contact", produces = "application/content.v2+json")
	public Contact2 getContactDetailsContent2() {
		return new Contact2("Sandhu", 23);
	}
}



class Contact1 {
	private String name;
	private int age;
	public Contact1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Contact1 [name=" + name + ", age=" + age + "]";
	}
	
	
}

class Contact2 {
	private String fullname;
	private int age;
	public Contact2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact2(String fullname, int age) {
		super();
		this.fullname = fullname;
		this.age = age;
	}
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Contact2 [Fullname=" + fullname + ", Age=" + age + "]";
	}
	
	
}