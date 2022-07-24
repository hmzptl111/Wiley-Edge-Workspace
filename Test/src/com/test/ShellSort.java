package com.test;

public class ShellSort {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 2, 1, 4, 7, 5};
		int n = 6;
		
		for(int gap = n / 2; gap > 0; gap /= 2) {
			for(int i = gap; i < n; i++) {
				int key = arr[i];
				int j = i;
				
				while(j >= gap && arr[j - gap] > key) {
					arr[j] = arr[j - gap];
					j -= gap;
				}
				arr[j] = key;
			}
		}
		
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}
}
