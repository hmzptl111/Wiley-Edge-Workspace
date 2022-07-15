package com.main;

import java.util.Scanner;

import com.employees.Employee;
import com.employees.Manager;
import com.employees.PartTime;
import com.employees.Regular;

public class Main {
//	₹
	public static void displayEmployeeInfo(Employee employee) {
		System.out.println("Employee type: " + employee.getEmployeeType());
		System.out.println("Employee name: " + employee.getEmployeeName());
		System.out.println("Weekly pay: " + employee.getWeeklyPay());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("---REGULAR---");
		System.out.println("Employee name: ");
		String name1 = sc.nextLine();
		System.out.println("Annual salary: ");
		int salary1 = sc.nextInt();
		System.out.println("Weekly hours worked: ");
		int hoursWorked1 = sc.nextInt();
		Regular regularEmployee = new Regular("REGULAR", name1, salary1, hoursWorked1);
		displayEmployeeInfo(regularEmployee);
		
		
		
		System.out.println("\n\n---MANAGER---");
		System.out.println("Employee name: ");
		String name2 = sc.next();
		System.out.println("Annual salary: ");
		int salary2 = sc.nextInt();
		System.out.println("Weekly hours worked: ");
		int hoursWorked2 = sc.nextInt();
		System.out.println("Weekly bonus: ");
		int weeklyBonus2 = sc.nextInt();
		Regular manager = new Manager("MANAGER", name2, salary2, weeklyBonus2, hoursWorked2);
		displayEmployeeInfo(manager);
		
		
		
		System.out.println("\n\n---CONTRACTOR---");
		System.out.println("Employee name: ");
		String name3 = sc.next();
		System.out.println("Hourly rate: ");
		int hourlyRate3 = sc.nextInt();
		System.out.println("Weekly hours worked: ");
		int hoursWorked3 = sc.nextInt();
		PartTime contractor = new PartTime("CONTRACTOR", name3, hourlyRate3, hoursWorked3);
		displayEmployeeInfo(contractor);
		
		sc.close();
	}

}
