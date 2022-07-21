package com.clock;

public class Clock {
	private String name = "tick";
	
	synchronized public void tick() {
		while(!name.equals("tick")) {
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
		while(!name.equals("tack")) {
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
		while(!name.equals("tock")) {
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
