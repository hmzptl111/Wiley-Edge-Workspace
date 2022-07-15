package com.persistence;

import java.util.List;

import com.bean.Project;
import com.database.ProjectDataSource;

public class ProjectDaoImpl implements ProjectDao {
	
	@Override
	public Project searchRecordById(int id) {
		return ProjectDataSource.getProjectById(id);
	}

	@Override
	public List<Project> getRecords() {
		return ProjectDataSource.getProjects();
	}
}