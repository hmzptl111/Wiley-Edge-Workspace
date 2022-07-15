package com.employee;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee("Chandler Bing");
		
		Employee e2 = new Employee("Chandler Bing", 19);
		
		Employee e3 = new Employee("Chandler Bing", 19, 30);
		
		Employee e4 = new Employee("Chandler Bing", 19, "Statistical Analyst");
		
		Employee e5 = new Employee("Chandler Bing", 19, 21, "Statistical Analyst");
		
		Employee e6 = new Employee("Chandler Bing", 19, "USA", 30);
		
		Employee e7 = new Employee("Chandler Bing", 19, 30, 5);
		
		Employee e8 = new Employee(19, "Chandler Bing", 5, "Statistical Analyst");
		
		Employee e9 = new Employee("Chandler Bing", 19, "Statistical Analyst", "USA", 5);
		
		Employee e10 = new Employee("Chandler Bing", 19, 30, "Statistical Analyst", "USA", 5);
	}

}
