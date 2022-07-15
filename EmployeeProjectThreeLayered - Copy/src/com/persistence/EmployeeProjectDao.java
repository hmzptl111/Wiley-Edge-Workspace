package com.persistence;

import java.util.List;

import com.bean.Employee;
import com.bean.Project;

public interface EmployeeProjectDao {
	//return project employee is associated with
	Project searchProjectByEmployeeId(int employeeId);
	
//	//return all employees associated with project
//	List<Employee> getAllEmployeesByProjectId(int pId);
	
	//add employee to project
	boolean assignEmployeeToProjectById(int eId, int pId);
	
	//remove employee from project
	boolean unassignEmployeeFromProjectById(int eId);
	
	//change employee project
	boolean changeEmployeeProjectById(int eId, int pId);
}
