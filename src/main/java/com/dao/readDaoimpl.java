package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.factory.ConnectionFactory;
import com.model.EducationModel;
import com.model.EmployeeModel;
import com.model.ProjectFile;

public class readDaoimpl implements ReadDao {
	private String result;

	@Override
	public List<EmployeeModel> readContact() {
		List<EmployeeModel> list = new ArrayList<EmployeeModel>();
		try {
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from contact");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				list.add(new EmployeeModel(rs.getInt("id"), rs.getString("name"), rs.getString("email"),
						rs.getString("message"), rs.getString("datetime")));

			}

		} catch (SQLException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public String readAdminLoginCredentials(String username, String password) {

		try {
			Connection con = ConnectionFactory.getConnection();
			String sql = "select * from adminlogin where username=? and password=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			boolean isExist = rs.next();
			if (isExist) {
				result = "EXISTS";
			} else {

				result = "NOT EXISTS";
			}

		} catch (SQLException e) {

			result = "EXCEPTION";
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public List<ProjectFile> readProjectData() {

		List<ProjectFile> list = new ArrayList<ProjectFile>();

		try {

			Connection con = ConnectionFactory.getConnection();

			PreparedStatement ps = con.prepareStatement("select * from myproject");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				list.add(new ProjectFile(rs.getInt("id"), rs.getString("filename"), rs.getString("datetime")));

			}

		} catch (SQLException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public List<EducationModel> readEducationData() {

		List<EducationModel> list = new ArrayList<EducationModel>();

		try {

			Connection con = ConnectionFactory.getConnection();

			PreparedStatement ps = con.prepareStatement("select * from education");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				list.add(new EducationModel(rs.getInt("sn"), rs.getString("year"), rs.getString("title"),
						rs.getString("subtitle"), rs.getString("description")));

			}

		} catch (SQLException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}

}
