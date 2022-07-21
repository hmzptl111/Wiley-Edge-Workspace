package com.main;

import java.util.Scanner;

import com.hashtable.HashTable;
import com.linkedlist.DoublyLinkedList.Node;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashTable ht = new HashTable();
		while(true) {
			System.out.println("1. Display");
			System.out.println("2. Add element to hash table");
			System.out.println("3. Remove element from hash table");
			System.out.println("Any other key to exit");
			
			switch(sc.nextInt()) {
				case 1:
					ht.display();
					break;
				case 2:
					System.out.println("Element: ");
					Node addedElement = ht.insert(sc.nextInt());
					if(addedElement != null) {
						System.out.println("Node added: " + addedElement.getData());
					} else {
						System.out.println("Couldn't add node");
					}
					break;
				case 3:
					System.out.println("Element: ");
					Node removedElement = ht.remove(sc.nextInt());
					if(removedElement != null) {
						System.out.println("Node removed: " + removedElement.getData());
					} else {
						System.out.println("Node doesn't exist");
					}
					break;
				default:
					System.out.println("xxx HASH TABLE xxx");
					System.exit(0);
			}
		}
	}
}