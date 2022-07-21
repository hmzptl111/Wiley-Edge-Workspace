package com.linkedlist;

public class DoublyLinkedList {
	public class Node {
		private int data;
		private Node next, prev;
		
		public Node(int data) {
			this.data = data;
		}
		
		public int getData() {
			return data;
		}
	}
	private Node head;
	
	public Node getHead() {
		return head;
	}
	
	public Node insert(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
		} else {
			Node currentNode = head;
			
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
			newNode.prev = currentNode;
		}
		
		return newNode;
	}
	
	public Node remove(int data) {
		if(head == null) return null;
		
		Node currentNode = head;
		while(currentNode != null && currentNode.data != data) {
			currentNode = currentNode.next;
		}
		
		if(currentNode == null) return null;
		
		if(currentNode.prev == null && currentNode.next == null) {
			head = null;
		} else {
			if(currentNode.prev != null) {
				currentNode.prev.next = currentNode.next;
			} else {
				//currentNode is the head node
				head = currentNode.next;
			}
			if(currentNode.next != null) {
				currentNode.next.prev = currentNode.prev;
			} else {
				//currentNode is the last node
				//not setting currentNode directly to null, because it is needed to return from the method
				currentNode.prev.next = null;
			}
		}
		
		return currentNode;
	}
	
	public void display() {
		Node currentNode = head;
		
		while(currentNode != null) {
			System.out.print("[" + currentNode.data + "] -> ");
			currentNode = currentNode.next;
		}
	}
	
	public void displayReverse() {
		Node currentNode = head;
		
		while(currentNode != null && currentNode.next != null) {
			currentNode = currentNode.next;
		}
		
		while(currentNode != null) {
			System.out.print("<- [" + currentNode.data + "]");
			currentNode = currentNode.prev;
		}
		System.out.println();
	}
}