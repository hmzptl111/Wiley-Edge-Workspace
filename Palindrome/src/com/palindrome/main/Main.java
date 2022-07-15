package com.palindrome.main;

import java.util.Scanner;

import com.palindrome.palindrome.Palindrome;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		Palindrome palindrome = new Palindrome();
		palindrome.setNum(num);
		
		if(palindrome.isPalindrome()) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

}
