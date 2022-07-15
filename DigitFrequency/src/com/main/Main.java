package com.main;

import java.util.Scanner;

import com.digitfrequency.DigitFrequency;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr;
				
		System.out.println("No. of elements: ");
		arr = new int[Integer.parseInt(sc.nextLine())];
		for(int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + ": ");
			arr[i] = Integer.parseInt(sc.nextLine());
		}

		DigitFrequency df = new DigitFrequency(arr);
		int[] digitFrequency = df.getDigitFrequency();
		for(int i = 0; i < 10; i++) {
			System.out.println("Frequency of digit " + i + ": " + digitFrequency[i]);
		}
		
		sc.close();
	}
}
