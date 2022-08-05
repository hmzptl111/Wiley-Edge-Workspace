package com.test;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

class File {
	public String fileContent = "";
	
	public void readFile(String fileName) {
		try(FileInputStream fis = new FileInputStream(fileName)) {
			int ch;
			while((ch = fis.read()) != -1) {
				fileContent += (char)ch;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getFileContent() {
		return fileContent;
	}
}

class BTree {
	class Node {
		public int frequency;
		public String word;
		Node left, right;
		
		public Node(String word) {
			this.word = word;
			this.frequency = 1;
		}
	}
	Node root;
	
	private Node insert(Node root, String word) {
		if(root == null) {
			root = new Node(word);
		} else {
			if(word.compareTo(root.word) < 0) {
				root.left = insert(root.left, word);
			} else if(word.compareTo(root.word) > 0) {
				root.right = insert(root.right, word);
			} else {
				root.frequency++;
			}
		}
		
		return root;
	}
	
	public Node insert(String word) {
		root = insert(root, word);
		return root;
	}
	
	private void inorder(Node root) {
		if(root == null) return;
		
		inorder(root.left);
		System.out.println(root.word + ": " + root.frequency);
		inorder(root.right);
	}
	
	public void display() {
		inorder(root);
	}
}

class Words {
	public List<String> getWords(String content) {
		List<String> words = new ArrayList<>();
		
		for(String word: content.split("[^a-zA-Z0-9_'-]+")) {
			words.add(word);			
		}
		
		return words;
	}
}

public class WordsInFile {

	public static void main(String[] args) {
		File f = new File();
		f.readFile("words");
		String fileContent = f.getFileContent();
		
		Words w = new Words();
		List<String> words = w.getWords(fileContent);
		
		BTree bt = new BTree();
		for(String word: words) {
			bt.insert(word);
		}
		
		bt.display();
	}
}