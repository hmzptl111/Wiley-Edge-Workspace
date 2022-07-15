package com.main.sortedlinkedlist;

import java.util.Scanner;

import com.linkedlist.sorted.SortedLinkedList;
import com.linkedlist.sorted.SortedLinkedList.Node;

public class SortedLinkedListMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SortedLinkedList sll = new SortedLinkedList();
		while(true) {
			System.out.println("1. Display linked list");
			System.out.println("2. Add element to linked list");
			System.out.println("3. Remove element from linked list");
			System.out.println("Any other key to exit");
			
			switch(sc.nextInt()) {
				case 1:
					sll.display();
					break;
				case 2:
					System.out.println("Element: ");
					Node addedElement = sll.insert(sc.nextInt());
					if(addedElement != null) {
						System.out.println("Element added: " + addedElement.getData());						
					} else {
						System.out.println("Element could not be added in the linked list");
					}
					break;
				case 3:
					System.out.println("Element: ");
					Node removedElement = sll.remove(sc.nextInt());
					if(removedElement != null) {
						System.out.println("Element removed: " + removedElement.getData());						
					} else {
						System.out.println("Element does not exist in the linked list");
					}
					break;
				default:
					System.out.println("xxx SORTED GENERIC LINKED LIST xxx");
					System.exit(0);
			}
		}
	}
}
