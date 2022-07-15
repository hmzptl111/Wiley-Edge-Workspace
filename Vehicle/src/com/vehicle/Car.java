package com.vehicle;

public class Car extends Vehicle {
	public Car(int horsePower, int mileage, int weight, int noOfWheels, String model) {
		super(horsePower, mileage, weight, noOfWheels, model);
		System.out.println("This is a car");
	}
	
//	@Override
//	public void displayHorsePower() {
//		super.displayHorsePower();
//		System.out.println("Cars have crazy horsepower");
//	}
//	
//	@Override
//	public void displayMileage() {
//		super.displayMileage();
//		System.out.println("Cars give good mileage");
//	}
//	
//	@Override
//	public void displayWeight() {
//		super.displayWeight();
//		System.out.println("Cars are heavy");
//	}
}
