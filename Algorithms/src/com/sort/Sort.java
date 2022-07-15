package com.sort;

import java.util.Scanner;

abstract public class Sort  {
	int[] arr;
	
	public Sort() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Number of items: ");
		int n = Integer.parseInt(sc.nextLine());
		arr = new int[n];
		System.out.println("Insert array: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
	}
	
	public Sort(int[] arr) {
		this.arr = arr;
	}
	
	public void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	
	abstract public int[] sort();
}
