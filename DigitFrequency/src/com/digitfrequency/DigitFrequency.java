package com.digitfrequency;

public class DigitFrequency {
	int[] arr, digitFrequency = new int[10];
	
	public DigitFrequency(int[] arr) {
		this.arr = arr;
	}
	
	public int[] getDigitFrequency() {
		for(int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			while(temp != 0) {
				digitFrequency[(temp%10)] += 1;
				temp /= 10;
			}
		}
		
		return digitFrequency;
	}
}
