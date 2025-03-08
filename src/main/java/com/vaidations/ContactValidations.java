package com.vaidations;

import com.dto.ContactDTO;

public class ContactValidations {

	private String result;

	public String validateContact(ContactDTO contactDTO) {
		if (contactDTO.getName().length() < 2 || contactDTO.getName().length() > 30) {
			result = "INVALID NAME";
		} else if (contactDTO.getEmail().length() < 5 || contactDTO.getEmail().length() > 50) {
			result = "INVALID EMAIL";
		} else if (contactDTO.getMessage().length() < 2 || contactDTO.getMessage().length() > 1000) {
			result = "INVALID MESSAGE";
		} else {
			result = "VALID";

		}
		return result;
	}

}
