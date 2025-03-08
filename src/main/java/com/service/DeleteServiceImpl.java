package com.service;

import java.sql.Connection;

import com.dao.Deletedao;
import com.dao.DeletedaoImpl;
import com.factory.ConnectionFactory;
import com.fileio.DeleteProjectIO;

public class DeleteServiceImpl implements DeleteService {
	private String result;

	@Override
	public String contactDeleteService(String id) {

		return new DeletedaoImpl().deleteContactDao(Integer.parseInt(id));

	}

	@Override
	public String projectFileDeleteService(String filename, String realPath) {

		// DAO -SUCCESS database
		// FOLDER DATA DELETE

		// exception->in folder
		// rollback -> database
		// folder success->commit

		try {
			Connection connection = new ConnectionFactory().getConnection();
			connection.setAutoCommit(false);
			Deletedao deletedaoImpl = new DeletedaoImpl();
			result = deletedaoImpl.deleteProjectFileDao(filename, connection, realPath);

			if (result.equalsIgnoreCase("SUCCESS")) {
				// Delete from folder
				DeleteProjectIO deleteProjectIO = new DeleteProjectIO();
				result = deleteProjectIO.deleteProjectFile(filename, realPath);
				if (result.equalsIgnoreCase("DELETED")) {
					connection.commit();
					result = "PROJECT DELETED SUCCESSFULLY";
				} else {
					connection.rollback();
					result = "ISSUE: FILE IO";
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
			result = "ISSUE: SERVICE LAYER";

		}

		return result;
	}

}
