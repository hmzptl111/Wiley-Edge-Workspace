package com.main;

import com.thread.TrialThread;

public class Main {

	public static void main(String[] args) {
		TrialThread tt1 = new TrialThread("ThreadOne");
		TrialThread tt2 = new TrialThread("ThreadTwo");
		TrialThread tt3 = new TrialThread("ThreadThree");
		TrialThread tt4 = new TrialThread("ThreadFour");
		
		tt1.start();
		tt2.start();
		tt3.start();
		tt4.start();
		
		System.out.println("Thread ID: " + Thread.currentThread().getId());
		System.out.println("Thread name: " + Thread.currentThread().getName());
		System.out.println("Thread priority: " + Thread.currentThread().getPriority());
		System.out.println("Is thread alive: " + Thread.currentThread().isAlive());
	}
}