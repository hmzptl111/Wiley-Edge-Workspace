package com.test;

public class MergeSort {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void merge(int[] arr, int[] left, int[] right, int n1, int n2) {
		int i = 0, j = 0, k = 0;
		while(i < n1 && j < n2) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		
		while(j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
	
	public static void sort(int[] arr, int n) {
		if(n < 2) return;
		
		int mid = n / 2;
		int[] left = new int[mid];
		int[] right = new int[n - mid];
		
		for(int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		
		for(int i = mid; i < n; i++) {
			right[i - mid] = arr[i];
		}
		
		sort(left, mid);
		sort(right, n - mid);
		
		merge(arr, left, right, mid, n - mid);
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 2, 1, 4, 7, 5};
		
		sort(arr, 6);
		
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}
}