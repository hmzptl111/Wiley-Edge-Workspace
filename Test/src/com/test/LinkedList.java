package com.test;


public class LinkedList {
	class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	Node head;

	public void insert(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}
	
	public void delete(int data) {
		if(head == null) return;
		
		if(head.data == data) {
			head = head.next;
			return;
		}
		
		Node currentNode = head;
		while(currentNode.next != null && currentNode.next.data != data) {
			currentNode = currentNode.next;
		}
		
		if(currentNode.next == null) return;
		
		currentNode.next = currentNode.next.next;
	}
	
	public void display() {
		if(head == null) return;
		
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		
		System.out.println();
		ll.display();
		System.out.println();
		
		ll.delete(10);

		System.out.println();
		ll.display();
		System.out.println();
	}
}
