package com.test;

public class SelectionSort {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = {3, 2, 1, 4, 7, 5};

		for(int i = 0; i < arr.length; i++) {
			int min = arr[i], temp = i;
			for(int j = i; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j];
					temp = j;
				}
			}
			swap(arr, temp, i);
		}
		
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}

}
