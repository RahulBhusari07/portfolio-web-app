package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

import com.dto.ContactDTO;
import com.dto.EducationDTO;
import com.factory.ConnectionFactory;

public class Createdaoimpl implements CreateDAO {

	private String result;

	@Override
	public String insertContact(ContactDTO contactDTO) {

		try {
			Connection connection = ConnectionFactory.getConnection();
			String sql = "insert into contact(name,email,message,datetime) values(?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, contactDTO.getName());
			ps.setString(2, contactDTO.getEmail());
			ps.setString(3, contactDTO.getMessage());
			ps.setString(4, LocalDateTime.now().toString());

			int row = ps.executeUpdate();
			if (row == 1) {
				result = "CONTACT INSERTED SUCCESSFULLY";
			}

		} catch (SQLException e) {
			e.printStackTrace();
			result = "SOMETHING WENT WRONG";
		}

		return result;

	}

	@Override
	public String insertProjectfile(String formattedfilename, Connection connection) {

		try {

			String sql = "insert into myproject(filename,datetime) values(?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, formattedfilename);
			ps.setString(2, LocalDateTime.now().toString());

			int row = ps.executeUpdate();
			if (row == 1) {
				result = "FILE NAME INSERTED SUCCESSFULLY";
			}

		} catch (SQLException e) {
			e.printStackTrace();
			result = "SOMETHING WENT WRONG";
		}

		return result;
	}

	@Override
	public String insertEducation(EducationDTO educationDTO) {

		try {
			Connection connection = ConnectionFactory.getConnection();
			String sql = "insert into education(year,title,subtitle,description) values(?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, educationDTO.getYear());
			ps.setString(2, educationDTO.getTitle());
			ps.setString(3, educationDTO.getSubtitle());
			ps.setString(4, educationDTO.getDescription());

			int row = ps.executeUpdate();
			if (row == 1) {
				result = "EDUCATION INSERTED SUCCESSFULLY";
			}

		} catch (SQLException e) {
			e.printStackTrace();
			result = "SOMETHING WENT WRONG";
		}

		return result;

	}

}
