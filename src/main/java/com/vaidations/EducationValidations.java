package com.vaidations;

import com.dto.EducationDTO;

public class EducationValidations {

	private String result;

	public String validateEducation(EducationDTO educationDTO) {

//		if (educationDTO.getYear().length() != 4) {
//			result = "INVALID YEAR";
//		} else if (educationDTO.getTitle().length() < 5 || educationDTO.getTitle().length() > 60) {
//			result = "INVALID TITLE";
//		} else if (educationDTO.getSubtitle().length() < 2 || educationDTO.getSubtitle().length() > 60) {
//			result = "INVALID SUBTITLE";
//		} else if (educationDTO.getDescription().length() < 10 || educationDTO.getDescription().length() > 1000) {
//			result = "INVALID DESCRIPTION";
//		} else {
//			result = "VALID";
//
//		}

		if (educationDTO.getYear().length() != 4) {
			result = "INVALID YEAR";
		} else if (educationDTO.getTitle().length() < 3 || educationDTO.getTitle().length() > 10) {
			result = "INVALID TITLE";
		} else if (educationDTO.getSubtitle().length() < 5 || educationDTO.getSubtitle().length() > 60) {
			result = "INVALID SUBTITLE";
		} else if (educationDTO.getDescription().length() < 10 || educationDTO.getDescription().length() > 1000) {
			result = "INVALID DESCRIPTION";
		} else {
			result = "VALID";
		}

		return result;

	}

}
