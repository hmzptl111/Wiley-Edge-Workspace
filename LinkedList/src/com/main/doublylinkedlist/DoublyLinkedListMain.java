package com.main.doublylinkedlist;

import java.util.Scanner;

import com.linkedlist.doubly.DoublyLinkedList;
import com.linkedlist.doubly.DoublyLinkedList.Node;

public class DoublyLinkedListMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		DoublyLinkedList dll = new DoublyLinkedList();
		while(true) {
			System.out.println("1. Display doubly linked list");
			System.out.println("2. Display reverse doubly linked list");
			System.out.println("3. Add element to doubly linked list");
			System.out.println("4. Remove element from doubly linked list");
			System.out.println("Press any other key to exit");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				dll.display();
				break;
			case 2:
				dll.displayReverse();
				break;
			case 3:
				System.out.println("Element: ");
				Node addedNode = dll.insert(sc.nextInt());
				if(addedNode != null) {
					System.out.println("Element added: " + addedNode.getData());
				} else {
					System.out.println("Couldn't add node");
				}
				break;
			case 4:
				System.out.println("Element: ");
				Node removedNode = dll.remove(sc.nextInt());
				if(removedNode != null) {
					System.out.println("Element removed: " + removedNode.getData());
				} else {
					System.out.println("Element doesn't exist");
				}
				break;
			default:
				System.out.println("xxx DOUBLY LINKED LIST xxx");
				System.exit(0);
			}	
		}
	}
}