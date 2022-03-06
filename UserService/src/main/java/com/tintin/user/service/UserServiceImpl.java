package com.tintin.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tintin.user.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	List<User> list = List.of(
			new User(1L,"Nitin","1234567"),
			new User(2L,"Tintin","2345678")
			);

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
