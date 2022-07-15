package com.database;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.bean.Project;

public class ProjectDataSource {
	private static List<Project> projects = new ArrayList<>();
	
	static {
		projects.add(new Project(101, "ML"));
		projects.add(new Project(102, "AI"));
		projects.add(new Project(103, "Web"));
	}
	
	public static Optional<List<Project>> getProjects() {
		return Optional.ofNullable(projects);
	}

	public static Optional<Project> getProjectById(int pId) {
		for(Project p: projects) {
			if(p.getId() == pId) return Optional.ofNullable(p);
		}
		return Optional.empty();
	}
	
	public static Optional<Project> getProject(Project project) {
		for(Project p: projects) {
			if(p.equals(project)) return Optional.ofNullable(p);
		}
		return null;
	}
	
	public static boolean addProject(Project project) {
		projects.add(project);
		return true;
	}
}
