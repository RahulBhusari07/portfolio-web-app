package com.dto;

public class ContactDTO {
	private String name;
	private String email;
	private String message;

	public ContactDTO(String name, String email, String message) {
		super();
		this.name = name;
		this.email = email;
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getMessage() {
		return message;
	}

}
