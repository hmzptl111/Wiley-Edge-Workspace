package com.service;

import com.persistence.EmployeeProjectDaoImpl;

public class EmployeeProjectServiceImpl implements EmployeeProjectService {
	@Override
	public boolean assignEmployeeToProject(int eId, int pId) {
		EmployeeProjectDaoImpl epdi = new EmployeeProjectDaoImpl();
		
		return epdi.assignEmployeeToProjectById(eId, pId);
	}

	@Override
	public boolean unassignEmployeeToProject(int eId) {
		EmployeeProjectDaoImpl epdi = new EmployeeProjectDaoImpl();
		
		return epdi.unassignEmployeeFromProjectById(eId);	
	}

	@Override
	public boolean changeEmployeeProjectById(int eId, int pId) {
		EmployeeProjectDaoImpl epdi = new EmployeeProjectDaoImpl();
		
		return epdi.changeEmployeeProjectById(eId, pId);
	}
}