package com.service;

import java.util.List;

import com.bean.Project;

public interface ProjectService {
	Project searchProjectById(int id);
	List<Project> getProjects();
}
