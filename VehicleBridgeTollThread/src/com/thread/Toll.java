package com.thread;

import com.vehicle.Vehicle;

public class Toll implements Runnable {
private Vehicle vehicle;
	
	public Toll(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			vehicle.crossToll();	
		}
	}

}
