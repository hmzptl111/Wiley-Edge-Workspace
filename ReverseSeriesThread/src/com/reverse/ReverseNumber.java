package com.reverse;

import com.input.InputNumber;

public class ReverseNumber extends InputNumber implements Runnable {
	private int reverseNumber;

	public ReverseNumber(int number) {
		super(number);
	}
	
	private void computeReverseNumber() {
		int number = getNumber();
		int reverse = 0;
		while(number != 0){
			int lastDigit = number % 10;
			reverse = reverse * 10 + lastDigit;
//			System.out.println(Thread.currentThread().getName() + " - " + reverse);
			number /= 10;
		}
		System.out.println(Thread.currentThread().getName() + " - reversed - " + reverse);
		setReverseNumber(reverse);
	}

	@Override
	public void run() {
		computeReverseNumber();
		System.out.println(getReverseNumber());
	}
	
	public int getReverseNumber() {
		return reverseNumber;
	}
	
	public void setReverseNumber(int reverseNumber) {
		this.reverseNumber = reverseNumber;
	}
}
