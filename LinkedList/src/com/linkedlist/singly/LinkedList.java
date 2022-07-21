package com.linkedlist.singly;

public class LinkedList {
	class Node {
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	Node head;
	
	public void insert(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head=newNode;
		} else {
			Node last = head;
			while(last.next != null) {
				last=last.next;
			}
			last.next=newNode;
		}
	}
	
	public void delete(int data) {
        Node curr = head, prev = null;
 
        if(curr != null && curr.data == data) {
            head = curr.next;
            return;
        }
 
        while(curr != null && curr.data != data) {
            prev = curr;
            curr = curr.next;
        }
 
        if(curr == null)
            return;
 
        prev.next = curr.next;
	}
	
	public void displayList() {
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode=currentNode.next;
		}
	}
}
