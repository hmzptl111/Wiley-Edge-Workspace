package com.sort;

/*
 * Time complexity: Best -> O(n2)
 * 					Worst -> O(n2)
 * 					Average -> O(n2)
 * 
 * Space complexity: O(1)
 */

public class SelectionSort extends Sort {

	@Override
	public int[] sort() {
		int[] arr = super.arr;
		int n = arr.length;
		
		for(int i = 0; i < (n - 1); i++) {
			int min = i;
			
			for(int j = (i + 1); j < n; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		return arr;
	}

}
