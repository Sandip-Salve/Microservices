package com.app.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.userservice.dao.UserEntityRepository;
import com.app.userservice.entity.UserEntity;

@Service
public class UserService {

	@Autowired
	private UserEntityRepository userRepo;
	
	public UserEntity getUser(long userId) {
		UserEntity exiUser = userRepo.findById(userId).orElseThrow(()->new RuntimeException("User Not Found!"));
		return exiUser;
	}
}
