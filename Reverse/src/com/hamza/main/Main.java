package com.hamza.main;

import java.util.Scanner;

import com.hamza.reverse.Reverse;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		Reverse reverse = new Reverse();
		reverse.setNum(num);
		System.out.println(reverse.getRnum());
	}
}
