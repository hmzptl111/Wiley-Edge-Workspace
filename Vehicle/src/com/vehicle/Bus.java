package com.vehicle;

public class Bus extends Vehicle {
	public Bus(int horsePower, int mileage, int weight, int noOfWheels, String model) {
		super(horsePower, mileage, weight, noOfWheels, model);
		System.out.println("This is a bus");
		
	}
	
//	@Override
//	public void displayHorsePower() {
//		super.displayHorsePower();
//		System.out.println("Buses have low horsepower");
//	}
//	
//	@Override
//	public void displayMileage() {
//		super.displayMileage();
//		System.out.println("Buses give good mileage");
//	}
//	
//	@Override
//	public void displayWeight() {
//		super.displayWeight();
//		System.out.println("Buses are very heavy");
//	}
}
