package com.service;

import java.util.List;
import java.util.Optional;

import com.bean.Project;
import com.persistence.ProjectDaoImpl;

public class ProjectServiceImpl implements ProjectService {
	@Override
	public Optional<Project> searchProjectById(int id) {
		ProjectDaoImpl projectDao = new ProjectDaoImpl();
		return projectDao.searchRecordById(id);
	}

	@Override
	public Optional<List<Project>> getProjects() {
		ProjectDaoImpl projectDao = new ProjectDaoImpl();
		return projectDao.getRecords();
	}	
}