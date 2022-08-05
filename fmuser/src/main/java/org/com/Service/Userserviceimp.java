package org.com.Service;

import java.util.ArrayList;
import java.util.List;
import org.com.model.User;
import org.com.repo.Userrepo;
import org.com.serviceinterface.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userserviceimp implements Userservice {

	// setter based DI
	// constructor based DI

	@Autowired
	private Userrepo repository;

	public Userserviceimp(Userrepo repository) {
		this.repository = repository;
	}

	public User addUsers(User emp) {

		return repository.save(emp);
	}

	@Override
	public User viewUser(Long id) {
		return repository.findById(id).get();

	}

	@Override
	public List<User> viewAllUsers() {
		List<User> list = new ArrayList<User>();
		repository.findAll().forEach(x -> list.add(x));
		return list;
	}

	@Override
	public void deleteUser(Long id) {
		repository.deleteById(id);  
		System.out.println("User deleted successfully!");
		
		
	}

	@Override
	public User updateUser(User user,Long id) {
		return repository.save(user);
		
	}

	
}
