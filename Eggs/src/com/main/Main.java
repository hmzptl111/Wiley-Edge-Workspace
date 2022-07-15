package com.main;

import java.util.Scanner;

import com.eggs.EggUnit;
import com.eggs.Eggs;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Eggs eggs = new Eggs();
		eggs.setN(n);
		EggUnit convertedEggs = eggs.getConvertedEggs();	
		
		System.out.println(convertedEggs.getGross() + " gross " + convertedEggs.getDozen() + " dozen " + convertedEggs.getRemainder() + " eggs");
	}
}
