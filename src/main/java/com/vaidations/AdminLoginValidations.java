package com.vaidations;

public class AdminLoginValidations {

	private String result;

	public String validateCredential(String username, String password) {
		if (username.length() < 4 || username.length() > 16) {
			result = "INVALID USERNAME";
		} else if (password.length() < 4 || password.length() > 16) {
			result = "INVALID PASSWORD";
		} else {
			result = "VALID";

		}
		return result;
	}

}
