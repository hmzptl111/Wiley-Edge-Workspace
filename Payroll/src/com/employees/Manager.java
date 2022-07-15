package com.employees;

public class Manager extends Regular {
	int weeklyBonus;

	public Manager(String employeeType, String employeeName, int annualSalary, int bonus,  int weeklyHoursWorked) {
		super(employeeType, employeeName, annualSalary, weeklyHoursWorked);
		this.weeklyBonus = bonus;
	}

	@Override
	public double getWeeklyPay() {
		return super.getWeeklyPay() + weeklyBonus;
	}
}
