package com.sell;

public class Sell {
	private boolean didHenLayAnEgg = true;
	
	synchronized public void layEgg(int eggsLayed) {
		if(!didHenLayAnEgg) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("hen laid an egg " + eggsLayed);
		didHenLayAnEgg = false;
		notify();
	}
	
	synchronized public void sellEgg(int gain) {
		if(didHenLayAnEgg) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("owner gained rs." + gain);
		didHenLayAnEgg = true;
		notify();
	}
}
