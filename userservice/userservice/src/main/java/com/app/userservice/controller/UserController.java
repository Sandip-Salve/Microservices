package com.app.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.app.userservice.entity.ContactEntity;
import com.app.userservice.entity.UserEntity;
import com.app.userservice.model.UserResponse;
import com.app.userservice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserResponse> getUser(@PathVariable("userId") Long userId){
		UserEntity user = userService.getUser(userId);
		List<ContactEntity> contactList = restTemplate.getForObject("http://contactservice/contact/user/"+user.getUserId(), List.class);
		UserResponse response = new UserResponse();
		response.setUserId(user.getUserId());
		response.setUserName(user.getUserName());
		response.setContactList(contactList);
		return new ResponseEntity<UserResponse> (response,HttpStatus.OK);
	}
}
