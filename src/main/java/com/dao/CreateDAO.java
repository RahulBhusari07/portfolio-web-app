package com.dao;

import java.sql.Connection;

import com.dto.ContactDTO;
import com.dto.EducationDTO;

public interface CreateDAO {

	public String insertContact(ContactDTO contactDTO);

	String insertProjectfile(String formattedfilename, Connection connection);

	String insertEducation(EducationDTO educationDTO);

}
