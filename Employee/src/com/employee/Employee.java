package com.employee;

public class Employee {
	int empId, empAge, empExpInYrs;
	String empName, empDesgn, empLocation;
	
	public Employee(String empName) {
		this.empName = empName;
	}
	
	public Employee(String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
	}
	
	public Employee(String empName, int empId, int empAge) {
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
	}
	
	public Employee(String empName, int empId, String empDesgn) {
		this.empName = empName;
		this.empId = empId;
		this.empDesgn = empDesgn;
	}
	
	public Employee(String empName, int empId, int empAge, String empDesgn) {
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empDesgn = empDesgn;
	}
	
	public Employee(String empName, int empId, String empLocation, int empAge) {
		this.empName = empName;
		this.empId = empId;
		this.empLocation = empLocation;
		this.empAge = empAge;
	}
	
	public Employee(String empName, int empId, int empAge, int empExpInYrs) {
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empExpInYrs = empExpInYrs;
	}
	
	public Employee(int empId, String empName, int empExpInYrs, String empDesgn) {
		this.empId = empId;
		this.empName = empName;
		this.empDesgn = empDesgn;
		this.empExpInYrs = empExpInYrs;
	}
	
	public Employee(String empName, int empId, String empDesgn, String empLocation, int empExpInYrs) {
		this.empName = empName;
		this.empId = empId;
		this.empDesgn = empDesgn;
		this.empLocation = empLocation;
		this.empExpInYrs = empExpInYrs;
	}
	
	public Employee(String empName, int empId, int empAge, String empDesgn, String empLocation, int empExpInYrs) {
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empDesgn = empDesgn;
		this.empLocation = empLocation;
		this.empExpInYrs = empExpInYrs;
	}
}
