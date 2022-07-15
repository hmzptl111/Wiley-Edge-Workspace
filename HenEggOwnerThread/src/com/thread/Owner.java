package com.thread;

import com.sell.Sell;

public class Owner implements Runnable {
	Sell sell;
	
	public Owner(Sell sell) {
		this.sell = sell;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 50; i++) {
			sell.sellEgg(i*2);			
		}
	}

}
