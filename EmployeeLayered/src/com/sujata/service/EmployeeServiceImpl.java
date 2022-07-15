package com.sujata.service;

import java.util.List;

import com.sujata.bean.Employee;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllRecords();
	}

	@Override
	public Employee searchEmployeeById(int employeeId) {
		return employeeDao.searchRecord(employeeId);
	}

	@Override
	public boolean addEmployee(Employee employee) {
		return employeeDao.addRecord(employee);
	}

	@Override
	public boolean deleteEmployee(int empId) {
		return employeeDao.deleteRecord(empId);
	}

}
