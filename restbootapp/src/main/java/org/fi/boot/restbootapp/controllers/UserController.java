package org.fi.boot.restbootapp.controllers;

import org.fi.boot.restbootapp.dto.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class UserController 
{
	@PostMapping("/authenticate")
	public boolean authenticateUser(@RequestParam("uname")String userName, @RequestParam("pwd")String password)
	{
		if(userName.equals("pankaj") && password.equals("cdac"))
			return true;
		else
			return false;
	}
	
	@GetMapping("/authenticateGet")
	public boolean authenticateUserGet(@RequestParam("uname")String userName, @RequestParam("pwd")String password)
	{
		if(userName.equals("pankaj") && password.equals("cdac"))
			return true;
		else
			return false;
	}
	
	@GetMapping("/getUserDetails")
	public Users getUserDetails()
	{
		Users objUsers = new Users();
		objUsers.setUserName("Nadeem");
		objUsers.setPassword("Sourabh");
		objUsers.setName("Choubey");
		objUsers.setEmail("Mohammed");
		
		return objUsers;
	}
}

















