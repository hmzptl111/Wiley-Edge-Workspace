package com.linkedlist.queue;

public class QueueUsingGenericLinkedList<T> {
	public class Node {
		private T data;
		private Node next, prev;

		public Node(T data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
		
		public T getData() {
			return data;
		}
	}
	Node front, back;
	
	public Node push(T data) {
		Node newNode = new Node(data);
		
		if(front == null && back == null) {
			front = newNode;
			back = newNode;
		} else {
			back.next = newNode;
			newNode.prev = back;
			back = newNode;			
		}
		
		return newNode;
	}
	
	public Node pop() {
		Node poppedNode = front;
		
		if(front != null) {
			if(front == back) {
				front = null;
				back = null;
			} else {
				front = front.next;
				front.prev = null;				
			}
		}
		
		return poppedNode;
	}
	
	public void display() {
		Node currentNode = front;
		
		while(currentNode != null) {
			System.out.print("[" + currentNode.data + "] <- ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}
	
	public void displayReverse() {
		Node currentNode = back;
		
		while(currentNode != null) {
			System.out.print("[" + currentNode.data + "] <- ");
			currentNode = currentNode.prev;
		}
		System.out.println();
	}
}
