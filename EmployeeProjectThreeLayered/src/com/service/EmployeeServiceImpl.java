package com.service;

import java.util.List;
import java.util.Optional;

import com.bean.Employee;
import com.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Optional<Employee> searchEmployeeById(int id) {
		EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
		return employeeDao.searchRecordById(id);
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
		return employeeDao.getRecords();
	}	
}