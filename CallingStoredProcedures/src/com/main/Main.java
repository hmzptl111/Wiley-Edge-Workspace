package com.main;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Connection connection = null;
		CallableStatement callableStatement = null;
		Scanner scanner = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc256", "root", "wiley");
			
			callableStatement=connection.prepareCall("{call minMaxSalaryByDepartmentId(?, ?, ?)}");
			
			System.out.println("Department ID: ");
			int departmentId = scanner.nextInt();
			callableStatement.setInt(1, departmentId);
			callableStatement.registerOutParameter(2, Types.DOUBLE);
			callableStatement.registerOutParameter(3, Types.DOUBLE);
			
			callableStatement.execute();
			
			System.out.println("Min salary: " + callableStatement.getDouble(2));
			System.out.println("Max salary: " + callableStatement.getDouble(3));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}