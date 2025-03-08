package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.factory.ConnectionFactory;

public class DeletedaoImpl implements Deletedao {

	private String result;

	@Override
	public String deleteContactDao(int id) {
		try {
			Connection con = ConnectionFactory.getConnection();
			String sql = "delete from contact where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			int row = ps.executeUpdate();
			if (row == 1) {
				result = "CONTACT DELETED SUCCESSFULLY";
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = "SOMETHING WENT WRONG";
		}
		return result;

	}

	@Override
	public String deleteProjectFileDao(String filename, Connection connection, String realPath) {
		// TODO Auto-generated method stub
		try {
			Connection con = ConnectionFactory.getConnection();
			String sql = "delete from myproject where filename=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, filename);
			int row = ps.executeUpdate();
			if (row == 1) {
				result = "SUCCESS";
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = "SOMETHING WENT WRONG : DAO ISSUE";
		}
		return result;

	}
}
