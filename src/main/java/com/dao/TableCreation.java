package com.dao;

import java.sql.Connection;
import java.sql.Statement;

import com.factory.ConnectionFactory;

public class TableCreation {

	public static void adminTable() {
		Connection connection = ConnectionFactory.getConnection();
		try {

			String sql = "create table adminlogin(" + "id int primary key auto_increment," + "username varchar(16),"
					+ "password varchar(16)  )";

			Statement statement = connection.createStatement();

			statement.execute(sql);

			statement.close();

			sql = "insert into adminlogin(username,password) values('admin777','RK@123')";
			statement = connection.createStatement();
			statement.execute(sql);

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			try {
				connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}

	}

	public static void EducationTable() {
		Connection connection = ConnectionFactory.getConnection();
		try {

			String sql = "create table education(" + "sn int primary key auto_increment," + "year int,"
					+ "title varchar(15)," + "subtitle varchar(25)," + "description varchar(100)  )";

			Statement statement = connection.createStatement();

			statement.execute(sql);

			statement.close();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}

	}

	public static void projectTable() {
		Connection connection = ConnectionFactory.getConnection();
		try {

			String sql = "create table myproject(" + "id int primary key auto_increment," + "filename varchar(100),"
					+ "datetime varchar(100)  )";

			Statement statement = connection.createStatement();

			statement.execute(sql);

			statement.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}

	}

	public static void ContactTable() {
		Connection connection = ConnectionFactory.getConnection();
		try {
			String sql = "create table contact(" + "id int primary key auto_increment," + "name varchar(30),"
					+ "email varchar(50)," + "message varchar(1000)," + "datetime varchar(45)  )";

			Statement statement = connection.createStatement();

			statement.execute(sql);

			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}

	}

}
