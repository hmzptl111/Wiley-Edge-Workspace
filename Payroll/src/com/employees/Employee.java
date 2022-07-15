package com.employees;

public class Employee {
	private String employeeType, employeeName;
	private int weeklyHoursWorked;
	
	public Employee(String employeeType, String employeeName, int weeklyHoursWorked) {
		this.employeeType = employeeType;
		this.employeeName = employeeName;
		this.weeklyHoursWorked = weeklyHoursWorked;
	}
	
	public String getEmployeeType() {
		return employeeType;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public int getWeeklyHoursWorked() {
		return weeklyHoursWorked;
	}
	
	public double getWeeklyPay() {
		return 0;
	}
}
