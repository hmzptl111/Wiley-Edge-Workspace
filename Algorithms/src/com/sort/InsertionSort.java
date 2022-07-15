package com.sort;

/*
 * Time complexity: Best -> O(n)
 * 					Worst -> O(n2)
 * 					Average -> O(n2)
 */

public class InsertionSort extends Sort {

	@Override
	public int[] sort() {
		int[] arr = super.arr;
		int n = arr.length;
		
		if(n <= 1) return arr;

	    for (int i = 1; i < n; i++) {
	      int key = arr[i];
	      int j = i - 1;
	      while (j >= 0 && key < arr[j]) {
	        arr[j + 1] = arr[j];
	        --j;
	      }
	      
	      arr[j + 1] = key;
	    }
		
		return arr;
	}
}
