package com.tintin.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tintin.user.entity.User;
import com.tintin.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserServiceController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long id) {
		User u = userService.getUser(id);
		List contacts = restTemplate.getForObject("http://contact-service/contact/user/"+u.getUserId(), List.class);
		u.setContacts(contacts);
		return u;
	}
}
