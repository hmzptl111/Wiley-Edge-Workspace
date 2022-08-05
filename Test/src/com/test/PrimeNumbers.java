package com.test;

public class PrimeNumbers {
	public static void prime(int x, int y) {
		
		for(int i = x; i <= y; i++) {
			boolean isPrime = true;
			for(int j = 2; j <= i/2; j++) {
				if(i % j == 0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		//prime numbers in a given range
		prime(11, 22);
	}
}