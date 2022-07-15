package com.vehicle;

public class Vehicle {
	String status = "on highway", vehicle;
	
	public Vehicle(String vehicleName) {
		this.vehicle = vehicleName;
	}
	
	synchronized public void crossBridge() {
		while(status != "on highway") {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Vehicle " + vehicle + " crossed the bridge");
		status = "crossed bridge";
		notifyAll();
	}
	
	synchronized public void crossToll() {
		while(status != "crossed bridge") {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Vehicle " + vehicle + " crossed the toll");
		status = "crossed toll";
		notifyAll();
	}
}
