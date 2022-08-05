package com.test;

import com.test.LinkedList.Node;

public class DoublyLinkedList {
	class Node {
		int data;
		Node next, prev;
		
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
		newNode.prev = currentNode;
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
		
		if(currentNode.next == null) return;
		
		currentNode.next = currentNode.next.next;
		if(currentNode.next != null) {
			currentNode.next.prev = currentNode;			
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
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insert(10);
		dll.insert(20);
		dll.insert(30);
		dll.insert(40);
		
		System.out.println();
		dll.display();
		System.out.println();
		
		dll.delete(30);
		
		System.out.println();
		dll.display();
		System.out.println();
	}
}