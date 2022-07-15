package com.employees;

public class Regular extends Employee {
	int annualSalary;

	public Regular(String employeeType, String employeeName, int annualSalary, int weeklyHoursWorked) {
		super(employeeType, employeeName, weeklyHoursWorked);
		this.annualSalary = annualSalary;
	}
	
	@Override
	public double getWeeklyPay() {
		return (annualSalary / 12) / 4;
	}
}
