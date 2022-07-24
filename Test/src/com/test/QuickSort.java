package com.test;

public class QuickSort {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int pointer = start - 1;
		
		for(int i = start; i < end; i++) {
			if(arr[i] < pivot) {
				pointer++;
				
				swap(arr, pointer, i);
			}
		}
		
		swap(arr, pointer + 1, end);
		return pointer + 1;
	}
	
	public static int[] sort(int[] arr, int start, int end) {
		if(start < end) {
			int pivot = partition(arr, start, end);
			
			sort(arr, start, pivot - 1);
			sort(arr, pivot + 1, end);			
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {3, 2, 1, 4, 7, 5};
		
		sort(arr, 0, arr.length - 1);
		
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}

}
