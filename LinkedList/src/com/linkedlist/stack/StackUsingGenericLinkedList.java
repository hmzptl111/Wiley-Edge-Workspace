package com.linkedlist.stack;

public class StackUsingGenericLinkedList<T> {
	class Node {
		T data;
		Node next, prev;

		public Node(T data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	Node firstNode = null, head = null;

	public void push(T data) {
		Node newNode = new Node(data);

		if (firstNode == null) {
			firstNode = newNode;
			head = newNode;
		} else {
			head.next = newNode;
			newNode.prev = head;
			head = newNode;
		}
	}

	public Node pop() {
		Node temp = head;
		
		if (firstNode == null)
			System.out.println("Stack is empty");
		else if (head == firstNode) {
			Node poppedElement = head;
			head = null;
			firstNode = null;
			return poppedElement;
		} else {
			head.prev.next = null;
			Node poppedElement = head;
			head = head.prev;
//			head = null;
			return poppedElement;
		}
		return null;
	}

	public void display() {
		Node currentNode = firstNode;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}
}
