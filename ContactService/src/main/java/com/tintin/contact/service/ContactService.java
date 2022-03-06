package com.tintin.contact.service;

import java.util.List;

import com.tintin.contact.entity.Contact;

public interface ContactService {
	
	public List<Contact> getContactsOfUser(Long userId);
}
