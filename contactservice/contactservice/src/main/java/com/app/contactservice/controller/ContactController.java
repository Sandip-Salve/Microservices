package com.app.contactservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.contactservice.entity.ContactEntity;
import com.app.contactservice.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@GetMapping("/user/{userId}")
	public ResponseEntity<List<ContactEntity>> getContacts(@PathVariable("userId") Long userId){
		List<ContactEntity> contactList = contactService.getContact(userId);
		return new ResponseEntity<List<ContactEntity>> (contactList, HttpStatus.OK);
	}
}
