package com.service;

import java.util.List;
import java.util.Optional;

import com.bean.Project;

public interface ProjectService {
	Optional<Project> searchProjectById(int id);
	Optional<List<Project>> getProjects();
}
