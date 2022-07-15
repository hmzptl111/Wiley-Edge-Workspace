package com.thread;

import com.clock.Clock;

public class Tock implements Runnable {
	private Clock clock;

	public Tock(Clock clock) {
		this.clock = clock;
	}

	@Override
	public void run() {
		for(int i = 0; i < 20; i++) {
			clock.tock();		
		}
	}

}
