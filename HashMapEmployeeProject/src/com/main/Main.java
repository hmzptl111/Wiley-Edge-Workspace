package com.main;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.bean.Employee;
import com.bean.Project;
//import com.sort.SortByYoe;

public class Main {

	public static void main(String[] args) {
//		Map<Employee, Project> ep = new HashMap<>();
		TreeMap<Employee, Project> ep = new TreeMap<>();
		
		Employee e1 = new Employee(1, "abc", 2);
		Project p1 = new Project(101, "asdf");

		Employee e2 = new Employee(2, "pqr", 1);
		Project p2 = new Project(102, "qwerty");

		Employee e3 = new Employee(3, "mno", 4);
		Project p3 = new Project(102, "qwerty");		
		
		
		ep.put(e1, p1);
		ep.put(e2, p2);
		ep.put(e3, p1);
		
		ep.forEach((key, value) -> System.out.println(key + " " + value));
	}

}
