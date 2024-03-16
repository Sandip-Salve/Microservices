package com.app.userservice.model;

import java.util.List;

import com.app.userservice.entity.ContactEntity;

public class UserResponse {

	private Long userId;
	private String userName;
	private List<ContactEntity> contactList;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<ContactEntity> getContactList() {
		return contactList;
	}
	public void setContactList(List<ContactEntity> contactList) {
		this.contactList = contactList;
	}
	
	
}
