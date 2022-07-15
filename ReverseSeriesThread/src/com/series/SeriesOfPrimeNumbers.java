package com.series;

public class SeriesOfPrimeNumbers extends Thread {
	private int number;
	
	public SeriesOfPrimeNumbers(int number) {
		this.number = number;
	}
	
	public void displaySeriesOfPrimeNumbers() {
		for(int i = 1; i <= number; i += 2) {
			boolean isPrime = true;
			for(int j = 2; j <= (i / 2); j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(Thread.currentThread().getName() + " - " + i);
			}
		}
	}
	
	@Override
	public void run() {
		displaySeriesOfPrimeNumbers();
	}
}