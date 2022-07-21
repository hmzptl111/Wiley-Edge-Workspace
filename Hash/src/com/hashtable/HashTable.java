package com.hashtable;

import com.linkedlist.DoublyLinkedList;
import com.linkedlist.DoublyLinkedList.Node;

public class HashTable {
	private static DoublyLinkedList[] hashTable = new DoublyLinkedList[10];
	
	static {
		for(int i = 0; i < 10; i++) {
			hashTable[i] = new DoublyLinkedList();
		}
	}
	
	private int hash(int key) {
		//division rule (key % size of hash table)
		return (key % hashTable.length);
	}
	
	public Node insert(int key) {
		int index = hash(key);
		
		DoublyLinkedList ll = hashTable[index];
		return ll.insert(key);
	}
	
	public Node remove(int key) {
		int index = key % 10;
		
		DoublyLinkedList ll = hashTable[index];
		return ll.remove(key);
	}
	
	public void display() {
		for(int i = 0; i < hashTable.length; i++) {
			System.out.print(i + ": ");
			hashTable[i].display();
			System.out.println();
		}
	}
}