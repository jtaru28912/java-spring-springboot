package com.example.demo;
import entities.User;

import java.util.Iterator;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import dao.UserRepo;
@SpringBootApplication
public class DemoJpaApplication {

	public static void main(String[] args) {
	//ioc
	ApplicationContext context = SpringApplication.run(DemoJpaApplication.class, args);
	//DI
	
	UserRepo userRepo = context.getBean(UserRepo.class);
	//assigning the values to consstructor
	User user = new User();
	user.setName("Taru Jain");
	user.setCity("Jabalpur");
	user.setStatus("Java Backend Developer");
//	User user1=new User();
//	user1.setName("Sourav");
//	user1.setCity("Bengal");
//	user1.setStatus("BCCI");
	User u =userRepo.save(user);
	System.out.println(u);
	//update
	Optional<User>op= userRepo.findById(1);
	User use=op.get();//True	
	use.setName("Jiya");
	User disp =userRepo.save(use);
	System.out.println(disp);
	//how to get the data
	Iterable<User> itr = userRepo.findAll();
	Iterator<User> iterator = itr.iterator();
	while(iterator.hasNext()) {
		User us = iterator.next();
		System.out.println(us);
	}
	//delete user 
	userRepo.deleteById(3);
	System.out.println("id has been deleted");
	//delete all
	Iterable<User> all = userRepo.findAll();
	
	
	}

}
