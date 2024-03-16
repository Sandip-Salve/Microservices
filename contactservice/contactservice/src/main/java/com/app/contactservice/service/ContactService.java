package com.app.contactservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.contactservice.dao.ContactEntityRepository;
import com.app.contactservice.entity.ContactEntity;

@Service
public class ContactService {

	@Autowired
	private ContactEntityRepository contactRepo;
	
	public List<ContactEntity> getContact(Long userId) {
		List<ContactEntity> contactList = contactRepo.findByUserId(userId);
		return contactList;
	}
}
