package com.persistence;

import java.util.List;

import com.bean.Project;

public interface ProjectDao {
	Project searchRecordById(int id);
	List<Project> getRecords();
}
