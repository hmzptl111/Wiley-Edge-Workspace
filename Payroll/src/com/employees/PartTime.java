package com.employees;

public class PartTime extends Employee {
	int hourlyRate;

	public PartTime(String employeeType, String employeeName, int hourlyRate, int weeklyHoursWorked) {
		super(employeeType, employeeName, weeklyHoursWorked);
		this.hourlyRate = hourlyRate;
	}
	
	public double getWeeklyPay() {
		return (super.getWeeklyHoursWorked() > 40) ? ((1.5 * hourlyRate) * super.getWeeklyHoursWorked()) : (hourlyRate * super.getWeeklyHoursWorked());
	}
}
