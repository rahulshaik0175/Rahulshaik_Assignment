package com.rahul.AuthenticateUser;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticateController {
	
	@RequestMapping("/authenticate/{username}/{password}")
	public String getMessage(@PathVariable("username") String username, @PathVariable("password") String password) {
		String existingUser = "rahul@gmail.com";
		String rahulPass = "Pass@123";
		
		if(username.equals(existingUser) && password.equals(rahulPass)) {
			return "Valid User";
		} else {
			return "Invalid User";
		}
	}
}
