package com.persistence;

import java.util.List;

import com.bean.Employee;
import com.database.EmployeeDataSource;

public class EmployeeDaoImpl implements EmployeeDao {
	
	@Override
	public Employee searchRecordById(int id) {
		return EmployeeDataSource.getEmployeeById(id);
	}

	@Override
	public List<Employee> getRecords() {
		return EmployeeDataSource.getEmployees();
	}
}