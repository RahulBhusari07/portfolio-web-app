package com.service;

import javax.servlet.http.Part;

import com.dto.ContactDTO;
import com.dto.EducationDTO;

public interface CreateService {

	public String insertContactDTOservice(ContactDTO contactdto);

	public String validateProjectFile(String filename, String contentType, long size);

	public String insertProjectFile(Part part, String realPath);

	public String insertResumeFile(Part part, String realPath);

	public String insertAddEducationservice(EducationDTO educationdto);

}
