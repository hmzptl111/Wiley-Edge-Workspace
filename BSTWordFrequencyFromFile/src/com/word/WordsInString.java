package com.word;

public class WordsInString {
	private String[] words;
 
	public WordsInString(String string) {
		words = string.split("[^a-zA-Z0-9_'-]+");
	}
	
	public String[] getWords() {
		return words;
	}
}
