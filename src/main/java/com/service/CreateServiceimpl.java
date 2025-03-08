package com.service;

import java.sql.Connection;
import java.time.LocalDateTime;

import javax.servlet.http.Part;

import com.dao.CreateDAO;
import com.dao.Createdaoimpl;
import com.dto.ContactDTO;
import com.dto.EducationDTO;
import com.factory.ConnectionFactory;
import com.fileio.UploadResumeIO;
import com.fileio.uploadProjectio;
import com.vaidations.ContactValidations;
import com.vaidations.EducationValidations;

public class CreateServiceimpl implements CreateService {
	private String result;

	private CreateDAO createDAO;

	public CreateServiceimpl() {
		createDAO = new Createdaoimpl();
	}

	@Override
	public String insertContactDTOservice(ContactDTO contactdto) {

		ContactValidations contactValidations = new ContactValidations();
		result = contactValidations.validateContact(contactdto);

		if (result.equalsIgnoreCase("VALID")) {

			result = createDAO.insertContact(contactdto);
			return result;

		} else {
			return result;
		}
	}

	@Override
	public String validateProjectFile(String filename, String contentType, long size) {

		if (!contentType.startsWith("image")) {
			result = "INVALID IMAGE TYPE";

		} else if (size > 512000) {
			result = "INVALID IMAGE SIZE";

		} else if (filename.length() < 5 || filename.length() > 100) {
			result = "INVALID IMAGE NAME";
		}

		else {
			result = "VALID";
		}

		return result;

	}

	@Override
	public String insertProjectFile(Part part, String realPath) {

		try {

			String datetime = LocalDateTime.now().toString();

			String[] split = datetime.split(":");

			String OrginalFilename = part.getSubmittedFileName();

			String formattedfilename;

			formattedfilename = split[0] + split[1] + split[2] + OrginalFilename;
			Connection connection = new ConnectionFactory().getConnection();
			connection.setAutoCommit(false);

			// INSERT IMAGE DATA IN DB

			// DAO :SUCCESS

			CreateDAO createdaoimpl = new Createdaoimpl();
			result = createdaoimpl.insertProjectfile(formattedfilename, connection);

			if (result.equalsIgnoreCase("FILE NAME INSERTED SUCCESSFULLY")) {

				// INSERT ACTUAL FILE IN FOLDER

				uploadProjectio uploadProjectio = new uploadProjectio();
				result = uploadProjectio.write(part, formattedfilename, realPath);

				if (result.equalsIgnoreCase("FILE UPLOAD SUCCESSFULLY")) {

					connection.commit();

					result = "WORK DONE FILE UPLOAD";

				} else {

					// ROLLBACK
					connection.rollback();
					result = "SOMETHING WENT WRONG => FILE IO";

				}

			} else {
				result = "SOMETHING WENT WRONG => DB";
			}

		} catch (Exception e) {

			e.printStackTrace();
			result = "SOMETHING WENT WRONG => SERVICE ISSUE";

		}
		return result;
	}

	@Override
	public String insertResumeFile(Part part, String realPath) {
		String contentType = part.getContentType();
		String originalFileName = part.getSubmittedFileName();
		long size = part.getSize();

		String result = validateResumefile(contentType, originalFileName, size);
		if (result.equalsIgnoreCase("VALID")) {
			// FILE IO - no need for dao because no filteration of data here

			UploadResumeIO uploadResume = new UploadResumeIO();
			result = uploadResume.writeResume(part, realPath);

			return result;

		} else {
			return result;
		}

	}

	public String validateResumefile(String contentType, String originalFileName, long size) {
		if (!contentType.endsWith("pdf")) {
			result = "INVALID RESUME TYPE => pdf is allowed";

		} else if (size > 122880) { // 120 KB = 122880 bytes
			result = "INVALID RESUME SIZE => less than 120 KB";
		} else if (originalFileName.length() < 2 || originalFileName.length() > 100) {
			result = "INVALID RESUME NAME => 2 TO 100 char allowed";
		}

		else {
			result = "VALID";
		}

		return result;

	}

	@Override
	public String insertAddEducationservice(EducationDTO educationdto) {

		result = new EducationValidations().validateEducation(educationdto);

		if (result.equalsIgnoreCase("VALID")) {
			// DAO
			result = new Createdaoimpl().insertEducation(educationdto);

			return result;
		} else {

			return result;
		}
	}

}