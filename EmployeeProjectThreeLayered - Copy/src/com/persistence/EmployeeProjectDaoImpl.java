package com.persistence;

import java.util.List;

import com.bean.Employee;
import com.bean.Project;
import com.database.EmployeeProjectDataSource;

public class EmployeeProjectDaoImpl implements EmployeeProjectDao {
	
	@Override
	public boolean assignEmployeeToProjectById(int eId, int pId) {
		return EmployeeProjectDataSource.assignEmployeeToProjectById(eId, pId);
	}
	
	@Override
	public boolean unassignEmployeeFromProjectById(int eId) {
		return EmployeeProjectDataSource.unassignEmployeeFromProjectById(eId);
	}

	@Override
	public boolean changeEmployeeProjectById(int eId, int pId) {
		return EmployeeProjectDataSource.changeEmployeeProject(eId, pId);
	}

	@Override
	public Project searchProjectByEmployeeId(int eId) {
		return EmployeeProjectDataSource.searchProjectByEmployeeId(eId);
	}

//	@Override
//	public Employee searchEmployeeByProjectId(int projectId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Employee> getAllEmployeesByProjectId(int pId) {
//		return null;
//	}
}