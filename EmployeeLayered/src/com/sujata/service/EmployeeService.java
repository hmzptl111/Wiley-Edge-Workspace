package com.sujata.service;

import java.util.List;

import com.sujata.bean.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	Employee searchEmployeeById(int employeeId);
	boolean addEmployee(Employee employee);
	boolean deleteEmployee(int empId);
}
