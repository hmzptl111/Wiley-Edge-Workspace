package com.frequency.bean;

public class Word {
	private String word;
	private int frequency;
	
	public Word(String word) {
		this.word = word;
		this.frequency = 1;
	}

	public String getWord() {
		return word;
	}
	
	public int getFrequency() {
		return frequency;
	}
	
	public void incrementWordFrequency() {
		frequency += 1;
	}
}
