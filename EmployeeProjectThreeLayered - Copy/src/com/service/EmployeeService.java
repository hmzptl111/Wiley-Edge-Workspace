package com.service;

import java.util.List;

import com.bean.Employee;

public interface EmployeeService {
	Employee searchEmployeeById(int id);
	List<Employee> getEmployees();
}
