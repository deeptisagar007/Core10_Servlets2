package com.marlabs.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/firstdatabase", "root", "");
		} catch (ClassNotFoundException e) {
			System.out.println("No Driver Found");
		} catch (SQLException e) {
			System.out.println("Could Not connect to Database");
		}
		return connection;
	}

}
