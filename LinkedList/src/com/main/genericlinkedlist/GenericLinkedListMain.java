package com.main.genericlinkedlist;

import java.util.Scanner;

import com.linkedlist.generic.GenericLinkedList;


public class GenericLinkedListMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		GenericLinkedList<Integer> gl = new GenericLinkedList<Integer>();
		while(true) {
			System.out.println("1. Display linked list");
			System.out.println("2. Display reverse linked list");
			System.out.println("3. Add element to linked list");
			System.out.println("4. Remove element from linked list");
			System.out.println("Any other key to exit");
			
			switch(sc.nextInt()) {
				case 1:
					gl.display();
					break;
				case 2:
					gl.displayReverse();
					break;
				case 3:
					System.out.println("Element: ");
					GenericLinkedList<Integer>.Node addedElement = gl.insert(sc.nextInt());
					if(addedElement != null) {
						System.out.println("Element added: " + addedElement.getData());						
					} else {
						System.out.println("Element could not be added in the linked list");
					}
					break;
				case 4:
					System.out.println("Element: ");
					GenericLinkedList<Integer>.Node removedElement = gl.remove(sc.nextInt());
					if(removedElement != null) {
						System.out.println("Element removed: " + removedElement.getData());						
					} else {
						System.out.println("Element does not exist in the linked list");
					}
					break;
				default:
					System.out.println("xxx GENERIC LINKED LIST xxx");
					System.exit(0);
			}
		}
	}

}
