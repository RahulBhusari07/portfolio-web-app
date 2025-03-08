package com.dao;

import java.util.List;

import com.model.EducationModel;
import com.model.EmployeeModel;
import com.model.ProjectFile;

public interface ReadDao {
	public List<EmployeeModel> readContact();

	public String readAdminLoginCredentials(String username, String password);

	public List<ProjectFile> readProjectData();

	public List<EducationModel> readEducationData();

}
