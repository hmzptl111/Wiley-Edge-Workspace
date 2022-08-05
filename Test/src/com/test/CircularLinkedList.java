package com.test;

public class CircularLinkedList {
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
			head.next = head;
			return;
		}
		
		Node currentNode = head;
		while(currentNode.next != head) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
		newNode.next = head;
	}
	
	public void delete(int data) {
		if(head == null) return;
		
		if(head.data == data) {
			if(head.next == null) {
				head = null;
			} else {
				Node currentNode = head;
				while(currentNode.next != head) {
					currentNode = currentNode.next;
				}
				head = head.next;
				currentNode.next = head;
			}
		}
		
		Node currentNode = head;
		while(currentNode.next != head && currentNode.next.data != data) {
			currentNode = currentNode.next;
		}
		
		if(currentNode.next == head) return;
		
		currentNode.next = currentNode.next.next;
	}
	
	public void display() {
		if(head == null) return;
		
		Node currentNode = head;
		while(currentNode.next != head) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		System.out.print(currentNode.data + " ");
	}
	
	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.insert(10);
		cll.insert(20);
		cll.insert(30);
		cll.insert(40);
		
		System.err.println();
		cll.display();
		System.out.println();
		
		cll.delete(10);
		
		System.out.println();
		cll.display();
		System.out.println();
	}
}