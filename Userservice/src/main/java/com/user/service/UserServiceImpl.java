package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;
@Service
public class UserServiceImpl implements UserServiceLayer {
	//user list
	List<User> list=List.of(new User
			(171L,"Taru","8962502550",null),
			new User
			(172L,"Tripti","1234567890",null),
			new User
			(173L,"Trusha","8456502550",null),
			new User
			(174L,"Tulika","896256550",null)
			);
	@Override
	public User getUser(Long id) {
		
		return list.stream().filter(user->user
				.getUserId()
				.equals(id)).findAny().orElse(null);
	}

}
