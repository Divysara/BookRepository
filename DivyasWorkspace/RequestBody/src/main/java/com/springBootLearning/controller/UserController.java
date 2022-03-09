package com.springBootLearning.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBootLearning.User;

@RestController
public class UserController {

	
	@PostMapping("/user")
	public String getDetails(@RequestBody User user) {
		System.out.println("Printing User Object: " + user);
		return " Success!";
	}
}
