package com.clone;

public class Department implements Cloneable {
	int id;
	String name, location;
	
	
	
	public Department(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	
}
