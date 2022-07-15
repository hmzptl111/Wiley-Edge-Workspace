package com.vehicle;

public class Vehicle {
	private int horsePower, mileage, weight, noOfWheels;
	private String model;
	
	public Vehicle(int horsePower, int mileage, int weight, int noOfWheels, String model) {
		System.out.println("This is a vehicle");
		this.horsePower = horsePower;
		this.mileage = mileage;
		this.weight = weight;
		this.noOfWheels = noOfWheels;
		this.model = model;
	}
	
//	public void displayHorsePower() {
//		System.out.println("This vehicle has " + this.horsePower + " horsepower");
//	}
//	
//	public void displayMileage() {
//		System.out.println("This vehicle gives " + this.mileage + " mileage");
//	}
//	
//	public void displayWeight() {
//		System.out.println("This vehicle weighs " + this.weight + " kilograms");
//	}
	
	public void display() {
		System.out.println("Horsepower: " + horsePower + "HP");
		System.out.println("Mileage: " + mileage + "L/100km");
		System.out.println("Weight: " + weight + "kg");
		System.out.println("Wheels: " + noOfWheels);
		System.out.println("Model: " + model);
	}
}
