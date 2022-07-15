package com.clock;

public class Clock {
	private String name = "tick";
	
	synchronized public void tick() {
		while(name.compareTo("tick") != 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(name);
		name = "tack";
		notifyAll();
	}
	
	synchronized public void tack() {
		while(name.compareTo("tack") != 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(name);
		name = "tock";
		notifyAll();
	}
	
	synchronized public void tock() {
		while(name.compareTo("tock") != 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(name);
		name = "tick";
		notifyAll();
	}
}
