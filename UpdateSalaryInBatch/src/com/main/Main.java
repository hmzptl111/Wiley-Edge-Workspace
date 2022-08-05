package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		Scanner sc = new Scanner(System.in);
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc256", "root", "wiley");
			preparedStatement = connection.prepareStatement("update employees set salary = salary + 500 where employee_id = ?");
						
			int choice = 0;
			do {
				System.out.println("Update salary of employee with ID: ");
				int id = sc.nextInt();
				preparedStatement.setInt(1, id);
				preparedStatement.addBatch();
				
				System.out.println("1. Update salary of another employee");
				System.out.println("0. Exit");
				
				choice = sc.nextInt();
			} while(choice != 0);
			
			int[] rows = preparedStatement.executeBatch();
			
			if(rows.length > 0) {
				System.out.println("Done");
			} else {
				System.out.println("Terminate");
			}
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			sc.close();
		}
	}
}