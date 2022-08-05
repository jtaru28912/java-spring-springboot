package org.com.serviceinterface;

import java.util.List;

import org.com.model.User;

public interface Userservice {
	// save/create
	User addUsers(User user); 

	User viewUser(Long id); // read through id

	List<User> viewAllUsers(); // read all

	public void deleteUser(Long id); // delete operation by id

	User updateUser(User user, Long id); // update

	// public void validateUser(String phone ); //validation criteria
}