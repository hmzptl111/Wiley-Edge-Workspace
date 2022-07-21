package com.main.circularlinkedlist;

import java.util.Scanner;

import com.linkedlist.circular.CircularLinkedList;
import com.linkedlist.circular.CircularLinkedList.Node;

public class CircularLinkedListMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CircularLinkedList cll = new CircularLinkedList();
		while(true) {
			System.out.println("1. Display circular linked list");
			System.out.println("2. Add node at end");
			System.out.println("3. Add node at front");
			System.out.println("4. Add node after existing node");
			System.out.println("5. Remove element from circular linked list");
			System.out.println("Press any other key to exit");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				cll.display();
				break;
			case 2:
				System.out.println("Element: ");
				Node addedNodeAtEnd = cll.insertAtEnd(sc.nextInt());
				if(addedNodeAtEnd != null) {
					System.out.println("Element added: " + addedNodeAtEnd.getData());
				} else {
					System.out.println("Couldn't add node");
				}
				break;
			case 3:
				System.out.println("Element: ");
				Node addedNodeAtFront = cll.insertAtFront(sc.nextInt());
				if(addedNodeAtFront != null) {
					System.out.println("Element added: " + addedNodeAtFront.getData());
				} else {
					System.out.println("Couldn't add node");
				}
				break;
			case 4:
				System.out.println("Element: ");
				int toAdd = sc.nextInt();
				System.out.println("After: ");
				int toAddAfter = sc.nextInt();
				Node addedNodeAfter = cll.insertAfter(toAdd, toAddAfter);
				if(addedNodeAfter != null) {
					System.out.println("Element added: " + addedNodeAfter.getData());
				} else {
					System.out.println("Node not found, added at the end of linked list");
				}
				break;
			case 5:
				System.out.println("Element: ");
				Node removedNode = cll.remove(sc.nextInt());
				if(removedNode != null) {
					System.out.println("Element removed: " + removedNode.getData());
				} else {
					System.out.println("Node doesn't exist");
				}
				break;
			default:
				System.out.println("xxx DOUBLY LINKED LIST xxx");
				System.exit(0);
			}	
		}
	}
}