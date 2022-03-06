package com.tintin.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.tintin.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{
	
	List<Contact> list = List.of(
			new Contact(1L,"nitu@gmail.com","Nitu","12345",1L),
			new Contact(1L,"deepika@gmail.com","Deepika","32345",1L)
			);

	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
