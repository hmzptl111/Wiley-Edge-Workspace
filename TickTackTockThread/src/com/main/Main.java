package com.main;

import com.clock.Clock;
import com.thread.Tack;
import com.thread.Tick;
import com.thread.Tock;

public class Main {

	public static void main(String[] args) {
		Clock clock = new Clock();
		
		Thread t1 = new Thread(new Tick(clock));
		Thread t2 = new Thread(new Tack(clock));
		Thread t3 = new Thread(new Tock(clock));
		
		t1.start();
		t2.start();
		t3.start();
	}
}