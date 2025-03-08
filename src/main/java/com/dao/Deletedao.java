package com.dao;

import java.sql.Connection;

public interface Deletedao {
	public String deleteContactDao(int id);

	public String deleteProjectFileDao(String filename, Connection connection, String realPath);

}
