package org.fi.boot.restbootapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController 
{
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome to the First RESTful Service in Spring Boot";
	}
}
