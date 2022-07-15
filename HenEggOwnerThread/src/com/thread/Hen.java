package com.thread;

import com.sell.Sell;

public class Hen implements Runnable {
	Sell sell;
	
	public Hen(Sell sell) {
		this.sell = sell;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 50; i++) {
			sell.layEgg(i);			
		}
	}

}
