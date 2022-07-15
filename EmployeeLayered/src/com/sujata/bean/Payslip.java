package com.sujata.bean;

public class Payslip {
	private double PFRate = 12, GSTRate = 18, DARate = 12;
	private double employeeSalaryPF, employeeSalaryGST, employeeSalaryDA, employeeSalaryBasic;
	private double bonus;
	private Employee employee;
	
	public Payslip(Employee employee, double bonus) {
		this.employee = employee;
		this.bonus = bonus;
		employeeSalaryPF = employee.getEmpSalary() * (PFRate / 100);
		employeeSalaryGST = employee.getEmpSalary() * (GSTRate / 100);
		employeeSalaryDA = employee.getEmpSalary() * (DARate / 100);
		employeeSalaryBasic = (employee.getEmpSalary() + bonus) - (employeeSalaryPF + employeeSalaryGST);
	}
	
	public void generatePayslip() {		
		System.out.println("Employee payslip");
		System.out.println("ID: " + employee.getEmpId());
		System.out.println("Name: " + employee.getEmpName());
		System.out.println("Designation: " + employee.getEmpDesignation());
		System.out.println("Department: " + employee.getEmpDepartment());
		System.out.println("Salary: " + employee.getEmpSalary());
		System.out.println("PF (" + PFRate + "%): " + employeeSalaryPF);
		System.out.println("GST (" + GSTRate + "%): " +  employeeSalaryGST);
		System.out.println("DA (" + DARate + "%): " +  employeeSalaryDA);
		System.out.println("Bonus: " + bonus);
		System.out.println("Basic salary: " + employeeSalaryBasic);
	}
}
