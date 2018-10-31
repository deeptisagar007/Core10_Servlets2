package com.marlabs.servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertEmployeeData {

	private InsertEmployeeData() {

	}

	// public static boolean insertData(String eName, int eId, int eSal, int deptNo)
	// {
	public static boolean insertData(EmployeeValueObjectModel eVO) {
		boolean insertResult = false;

		String eName = eVO.geteName();
		int eId = eVO.geteId();
		int eSal = eVO.geteSal();
		int deptNo = eVO.getDeptNo();

		Connection connection = DBConnect.getConnection();
		if (connection != null) {
			System.out.println("Database Connected");
		}

		String INSERT_QUERY = "INSERT INTO employee VALUES( ?, ?, ?, ? );";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY);
			preparedStatement.setInt(1, eId);
			preparedStatement.setString(2, eName);
			preparedStatement.setDouble(3, eSal);
			preparedStatement.setInt(4, deptNo);
			int inserted = preparedStatement.executeUpdate();

			if (inserted > 0) {
				insertResult = true;
				System.out.println("Data is been inserted");
			}

		} catch (SQLException e) {
			System.out.println("Statement Preparation Error");
		}

		return insertResult;
	}

}
