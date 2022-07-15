package com.sujata.persistence;

import java.util.List;

import com.sujata.bean.Employee;

public interface EmployeeDao {

	boolean addRecord(Employee employee);
	boolean deleteRecord(int empId);
	Employee searchRecord(int empId);
	List<Employee> getAllRecords();
	
}
