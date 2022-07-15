package com.persistence;

import java.util.List;
import java.util.Optional;

import com.bean.Project;

public interface ProjectDao {
	Optional<Project> searchRecordById(int id);
	Optional<List<Project>> getRecords();
}
