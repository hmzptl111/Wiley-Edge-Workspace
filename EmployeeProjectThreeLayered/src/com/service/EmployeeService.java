package com.service;

import java.util.List;
import java.util.Optional;

import com.bean.Employee;

public interface EmployeeService {
	Optional<Employee> searchEmployeeById(int id);
	Optional<List<Employee>> getEmployees();
}
