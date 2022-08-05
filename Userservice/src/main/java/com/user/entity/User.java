package com.user.entity;

import java.util.ArrayList;
import java.util.List;

//POJO
public class User {
	private Long userId;
	private String userName;
	private String phone;
	// user list
	List<Contact> contacts = new ArrayList<>();

	// constructor
	public User() {
		super();
	}

	// parasmeterized constructor
	public User(Long userId, String userName, String phone, List<Contact> contacts) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.phone = phone;
		this.contacts = contacts;
	}

	// getter setters
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

}
