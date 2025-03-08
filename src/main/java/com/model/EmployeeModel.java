package com.model;

public class EmployeeModel {

	private int id;
	private String name;
	private String email;
	private String message;
	private String datetime;

	public EmployeeModel(int id, String name, String email, String message, String datetime) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.message = message;
		this.datetime = datetime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

}
