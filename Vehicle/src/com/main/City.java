package com.main;

import com.vehicle.Bus;
import com.vehicle.Car;
import com.vehicle.Truck;
import com.vehicle.Vehicle;

public class City {
	public static void main(String[] args) {
		Vehicle car = new Car(280, 12, 900, 4, "Ferrari 250 GT California SWB Spider");
		car.display();
		System.out.println("----------");
		
		Vehicle truck = new Truck(200, 5, 25500, 8, "AVTR 2620");
		truck.display();
		System.out.println("----------");
		
		Vehicle bus = new Bus(140, 12, 7500, 4, "TATA Starbus");
		bus.display();
	}
}
