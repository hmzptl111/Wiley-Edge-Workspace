package com.sort;

/*
 * Time complexity: Best -> O(n)
 * 					Worst -> O(n2)
 * 					Average -> O(n2)
 */

public class BubbleSort extends Sort {
	
	@Override
	public int[] sort() {
		int[] arr = super.arr;
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			boolean swapped = false;
			for(int j = 0; j < ((n - i) - 1); j++) {
				int temp = arr[j];
				if(arr[j] > arr[j + 1]) {
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			
			//optimized, if there are no swaps in a pass, the list is already sorted
			if(!swapped) return arr;
		}
		
		return arr;
	}
}
