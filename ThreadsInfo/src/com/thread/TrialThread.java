package com.thread;

public class TrialThread extends Thread {
	public TrialThread(String threadName) {
		super(threadName);
	}
	
	@Override
	public void run() {
		System.out.println("Thread ID: " + Thread.currentThread().getId());
		System.out.println("Thread name: " + Thread.currentThread().getName());
		System.out.println("Thread priority: " + Thread.currentThread().getPriority());
		System.out.println("Is thread alive: " + Thread.currentThread().isAlive());
	}
}
