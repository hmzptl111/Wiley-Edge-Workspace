package com.main;

import com.sell.Sell;
import com.thread.Hen;
import com.thread.Owner;

public class Main {

	public static void main(String[] args) {
		Sell sell = new Sell();
		
		Thread t1 = new Thread(new Hen(sell));
		Thread t2 = new Thread(new Owner(sell));
		
		t1.start();
		t2.start();
	}
}