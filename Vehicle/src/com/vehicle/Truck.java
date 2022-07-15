package com.vehicle;

public class Truck extends Vehicle {
	public Truck(int horsePower, int mileage, int weight, int noOfWheels, String model) {
		super(horsePower, mileage, weight, noOfWheels, model);
		System.out.println("This is a truck");
		
	}
	
//	@Override
//	public void displayHorsePower() {
//		super.displayHorsePower();
//		System.out.println("Trucks have decent horsepower");
//	}
//	
//	@Override
//	public void displayMileage() {
//		super.displayMileage();
//		System.out.println("Trucks have decent mileage");
//	}
//	
//	@Override
//	public void displayWeight() {
//		super.displayWeight();
//		System.out.println("Trucks are immensely heavy");
//	}
}
