package com.main;

import com.thread.Bridge;
import com.thread.Toll;
import com.vehicle.Vehicle;

public class Main {

	public static void main(String[] args) {
		//create 5 vehicles
		Vehicle[] vehicles = {new Vehicle("v1"), new Vehicle("v2"), new Vehicle("v3"), new Vehicle("v4"), new Vehicle("v5")};
		
		Thread t1 = null, t2 = null;
		for(int i = 0; i < 5; i++) {
			t1 = new Thread(new Bridge(vehicles[i]));
			t2 = new Thread(new Toll(vehicles[i]));			

			t1.start();
			t2.start();		
		}
	}
}