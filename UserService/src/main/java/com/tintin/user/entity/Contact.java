package com.tintin.user.entity;

public class Contact {
	
	private Long contactId;
	private String email;
	private String contactName;
	private String contactNumber;
	private Long userId;
	
	public Contact(Long contactId, String email, String contactName, String contactNumber, Long userId) {
		super();
		this.contactId = contactId;
		this.email = email;
		this.contactName = contactName;
		this.contactNumber = contactNumber;
		this.userId = userId;
	}

	public Contact() {
		super();
	}

	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
}
