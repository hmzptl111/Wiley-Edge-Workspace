package com.test;

public class InsertionSort {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 2, 1, 4, 7, 5};
		
		for(int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			for(int j = 0; j < i; j++) {
				if(arr[i] < arr[j]) {
					for(int k = i; k > j; k--) {
						arr[k] = arr[k - 1];
					}
					arr[j] = temp;
				}
			}
		}
		
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}
}