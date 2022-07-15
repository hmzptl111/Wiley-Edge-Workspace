package com.main;

import java.util.Scanner;

import com.hashtable.HashTable;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashTable ht = new HashTable();
		while(true) {
			System.out.println("1. Display");
			System.out.println("2. Add element to hash table");
			System.out.println("Any other key to exit");
			
			switch(sc.nextInt()) {
				case 1:
					ht.display();
					break;
				case 2:
					System.out.println("Element: ");
					ht.insert(sc.nextInt());
					break;
				default:
					System.out.println("xxx HASH TABLE xxx");
					System.exit(0);
			}
		}
	}
}