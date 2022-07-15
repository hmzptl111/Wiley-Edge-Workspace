package com.thread;

import com.clock.Clock;

public class Tack implements Runnable {
	private Clock clock;

	public Tack(Clock clock) {
		this.clock = clock;
	}

	@Override
	public void run() {
		for(int i = 0; i < 20; i++) {
			clock.tack();	
		}
	}

}
