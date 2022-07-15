package com.persistence;

import java.util.List;
import java.util.Optional;

import com.bean.Employee;

public interface EmployeeDao {
	Optional<Employee> searchRecordById(int id);
	Optional<List<Employee>> getRecords();
}
