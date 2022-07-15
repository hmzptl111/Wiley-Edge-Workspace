package com.sort;

public class ShellSort extends Sort {
	public ShellSort(int[] arr) {
		super(arr);
	}

	// Rearrange elements at each n/2, n/4, n/8, ... intervals
	public int[] shellSort(int array[], int n) {
		for (int interval = n / 2; interval > 0; interval /= 2) {
			for (int i = interval; i < n; i += 1) {
				int temp = array[i];
				int j;
				for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
					array[j] = array[j - interval];
				}
				array[j] = temp;
			}
		}
		
		return arr;
	}

	@Override
	public int[] sort() {
		int[] arr = super.arr;
		int n = arr.length;
		
		if(n <= 1) return arr;
		
		return shellSort(arr, n);
	}
}