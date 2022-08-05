package com.contact.service;

import java.util.List;

import com.contact.entity.Contact;

public interface ContactServiceLayer {
	public List<Contact> getContactOfUser(Long userId);
}
