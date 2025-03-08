package com.factory;

import java.sql.Connection;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionFactory {
	public static Connection getConnection() {
		Connection con = null;

		try {

			MysqlDataSource dataSource = new MysqlDataSource();
			dataSource.setUrl("jdbc:mysql://localhost:3309/portfolio");
			dataSource.setUser("root");
			dataSource.setPassword("Admin@123");
			// HIkari COnfig
			HikariConfig hikariConfig = new HikariConfig();
			hikariConfig.setDataSource(dataSource);
			// Pool Of object creation
			HikariDataSource hikariDataSource = new HikariDataSource(hikariConfig);
			hikariDataSource.setMinimumIdle(5);
			hikariDataSource.setMaximumPoolSize(1000);

			con = hikariDataSource.getConnection();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
