package com.bean;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	private int id, yoe;
	private String name;
	
	public Employee(int id, String name, int yoe) {
		this.id = id;
		this.name = name;
		this.yoe = yoe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getYoe() {
		return id;
	}

	public void setYoe(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee otherEmployee) {
		if(yoe > otherEmployee.getYoe()) {
			return 1;
		} else if(yoe < otherEmployee.getYoe()) {
			return -1;
		} else if(this.equals(otherEmployee)) {
			return 0;
		} else {
			return -1;
		}
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

	
}
