package com.main.stacklinkedlist;

import java.util.Scanner;

import com.linkedlist.stack.StackUsingGenericLinkedList;

public class StackUsingGenericLinkedListMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		StackUsingGenericLinkedList<Integer> stackUsingGenericLinkedList = new StackUsingGenericLinkedList<Integer>();

		while(true) {
			System.out.println("1. Display stack");
			System.out.println("2. Push element to stack");
			System.out.println("3. Pop element from stack");
			System.out.println("Any other key to exit");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				stackUsingGenericLinkedList.display();
				break;
			case 2:
				System.out.println("Enter element: ");
				stackUsingGenericLinkedList.push(sc.nextInt());
				break;
			case 3:
				stackUsingGenericLinkedList.pop();
				System.out.println("Stack after popping: ");
				stackUsingGenericLinkedList.display();
				break;
			default:
				System.exit(0);
			}
		}
	}
}
