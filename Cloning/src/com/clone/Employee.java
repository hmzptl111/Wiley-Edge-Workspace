package com.clone;

public class Employee extends Person implements Cloneable {
	private String designation;
	private double salary;
	private Department department;
	
	
	public Employee(int id, String name, String designation, Department department, double salary) {
		super(id, name);
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [designation=" + designation + ", department=" + department + ", salary=" + salary + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee employee = (Employee) super.clone();
		Department employeeDepartment = (Department) department.clone();
		employee.setDepartment(employeeDepartment);
		return employee;
	}
}