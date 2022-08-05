package com.main;

import com.clone.Department;
import com.clone.Employee;

public class Main {

	public static void main(String[] args) {
		//cloning Employee
		
		try {
			Department IT = new Department(1, "IT", "Mumbai");
			Employee employee = new Employee(101, "Happy", "Manager", IT, 700000);
			Employee clonedEmployee = (Employee) employee.clone();
			
			System.out.println("Before modification");
			System.out.println(employee);
			System.out.println(clonedEmployee);
			
			
			Department Sales = new Department(2, "Sales", "Delhi");
			clonedEmployee.setDepartment(Sales);
			System.out.println("After modification");
			System.out.println(employee);
			System.out.println(clonedEmployee);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}