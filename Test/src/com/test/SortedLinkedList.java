package com.test;

public class SortedLinkedList {
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
		
		if(data < head.data) {
			newNode.next = head;
			head = newNode;
			return;
		}
		
		Node currentNode = head;
		while(currentNode.next != null && data > currentNode.next.data) {
			currentNode = currentNode.next;
		}
		newNode.next = currentNode.next;
		currentNode.next = newNode;
	}
	
	public void delete(int data) {
		if(head == null) return;
		
		if(head.data == data) {
			if(head.next == null) {
				head = null;
			} else {
				head = head.next;
			}
		}
		
		Node currentNode = head;
		while(currentNode.next != null && currentNode.next.data != data) {
			currentNode = currentNode.next;
		}
		if(currentNode.next == null) {
			if(currentNode.data == data) {
				currentNode = null;
			}
		}
		
		if(currentNode.next != null) {
			currentNode.next = currentNode.next.next;			
		}
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
		SortedLinkedList sll = new SortedLinkedList();
		sll.insert(20);
		sll.insert(10);
		sll.insert(40);
		sll.insert(30);
		
		System.out.println();
		sll.display();
		System.out.println();
		
		sll.delete(10);

		System.out.println();
		sll.display();
		System.out.println();
	}
}