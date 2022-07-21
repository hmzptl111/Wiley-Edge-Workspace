package com.main;

import java.io.IOException;

import com.bst.BST;
import com.file.input.ReadFile;
import com.word.WordsInString;

public class Main {

	public static void main(String[] args) {
		BST bst = new BST();
		
		ReadFile rf = null;
		try {
			rf = new ReadFile("test.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		WordsInString wis = new WordsInString(rf.getContent());
		String[] words = wis.getWords();
		for(String word: words) {
			bst.insert(word);
		}
		
		bst.display();
	}
}