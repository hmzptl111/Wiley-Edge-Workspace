package com.persistence;

import java.util.List;
import java.util.Optional;

import com.bean.Employee;
import com.database.EmployeeDataSource;

public class EmployeeDaoImpl implements EmployeeDao {
	
	@Override
	public Optional<Employee> searchRecordById(int id) {
		return EmployeeDataSource.getEmployeeById(id);
	}

	@Override
	public Optional<List<Employee>> getRecords() {
		return EmployeeDataSource.getEmployees();
	}
}