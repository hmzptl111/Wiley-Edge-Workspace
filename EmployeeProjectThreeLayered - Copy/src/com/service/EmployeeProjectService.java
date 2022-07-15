package com.service;

public interface EmployeeProjectService {
	boolean assignEmployeeToProject(int eId, int pId);
	
	boolean unassignEmployeeToProject(int eId);
//	
	boolean changeEmployeeProjectById(int eId, int pId);
}
