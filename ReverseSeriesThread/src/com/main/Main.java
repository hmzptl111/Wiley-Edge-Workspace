package com.main;

import com.reverse.ReverseNumber;
import com.series.SeriesOfPrimeNumbers;

public class Main {

	public static void main(String[] args) {
		ReverseNumber rn1 = new ReverseNumber(123);
		ReverseNumber rn2 = new ReverseNumber(456);
		
		Thread t1 = new Thread(rn1);
		Thread t2 = new Thread(rn2);
		
		SeriesOfPrimeNumbers t3 = new SeriesOfPrimeNumbers(19);
		SeriesOfPrimeNumbers t4 = new SeriesOfPrimeNumbers(56);
		
		t1.start();
		t2.start();
		
		t3.start();
		t4.start();
		
		System.out.println(Thread.currentThread().getName());
	}
}