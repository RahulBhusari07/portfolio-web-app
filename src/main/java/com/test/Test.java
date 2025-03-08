package com.test;

import java.sql.Connection;

import com.factory.ConnectionFactory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = ConnectionFactory.getConnection();
		System.out.println();

	}

}
