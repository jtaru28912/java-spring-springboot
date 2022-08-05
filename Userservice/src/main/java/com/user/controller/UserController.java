package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.Contact;
import com.user.entity.User;
import com.user.service.UserServiceLayer;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserServiceLayer userService;
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") 
	Long userId) {
		User user =userService.getUser(userId);
		List  contacts= this.restTemplate
				.getForObject("localhost:9091/contact/user/"
				+ user.getUserId(),List.class);
		user.setContacts(contacts);
		return user;
	}
}
