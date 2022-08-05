package com.test;

public class ThreadDemo implements Runnable {

	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
	
		Thread t1 = new Thread(td);
		t1.start();
	}
	
	@Override
	public void run() {
		System.out.println("thread created");
	}
}