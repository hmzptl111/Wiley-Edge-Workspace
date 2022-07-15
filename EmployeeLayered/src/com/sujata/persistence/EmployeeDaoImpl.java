package com.sujata.persistence;

import java.util.List;

import com.sujata.bean.Employee;
import com.sujata.database.EmployeeDataSource;

public class EmployeeDaoImpl implements EmployeeDao {

	
	@Override
	public boolean addRecord(Employee employee) {
		return EmployeeDataSource.addEmployee(employee);
	}

	@Override
	public boolean deleteRecord(int empId) {
		return EmployeeDataSource.deleteEmployee(empId);
	}

	@Override
	public Employee searchRecord(int empId) {
		List<Employee> employees=EmployeeDataSource.getEmployeeList();
		for(Employee employee: employees) {
			if(employee.getEmpId() == empId) {
				return employee;
			}
		}
//		for(int index=0;index<employees.length&&employees[index]!=null;index++) {
//			if(employees[index].getEmpId()==empId)
//				return employees[index];
//		}
		return null;
	}

	@Override
	public List<Employee> getAllRecords() {
		return EmployeeDataSource.getEmployeeList();
	}

}
