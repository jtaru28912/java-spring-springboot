package org.com.controller;

import java.util.List;

import org.com.model.User;
import org.com.serviceinterface.Userservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserControl {

	private Userservice userservice;

	public UserControl(Userservice userservice) {
		this.userservice = userservice;
	}

	// REST API
	@PostMapping() // create
	public ResponseEntity<User> addUsers(@RequestBody User user) {
		return new ResponseEntity<User>(userservice.addUsers(user), HttpStatus.CREATED);

	}

	@GetMapping(value = "/{id}") // read operation by ID
	public User viewUser(@PathVariable("id") Long id) {
		return userservice.viewUser(id);
	}

	@GetMapping(value = "/showall") // read all users
	public List<User>viewAllUsers() {
		return userservice.viewAllUsers();
	}

	@DeleteMapping(value = "/delete/{id}") // delete user by id
	public void deleteUser(@PathVariable("id") Long id) {
		userservice.deleteUser(id);
	}

	@PutMapping("/update/{id}") // update operation
	public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable("id") Long id) {
		return new ResponseEntity<User>(userservice.updateUser(user, id), HttpStatus.OK);
	}

//	@GetMapping(value="/validate")
//	public void validateUser(String phone) {
//		userservice.validateUser(phone);
//		
//	}

}

