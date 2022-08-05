package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
@Service
public class ContactServiceImpl implements ContactServiceLayer{

	List<Contact> list = List.of(
			new Contact (1L, "jtaru@gmail.com","Taru",171L),
			new Contact (2L, "tbhatia@email.com","Tripti", 172L),
			new Contact (3L, "trusha@email.com", "Trusha", 173L),
			new Contact (4L, "tulika@email.com", "Tulika", 174L)
			);
	@Override
	public List<Contact> getContactOfUser(Long userId) {
		//sjow the relation of user class
		return list.stream().filter(contact->contact.getcId()
				.equals(userId)).collect(Collectors.toList());
	}

}
