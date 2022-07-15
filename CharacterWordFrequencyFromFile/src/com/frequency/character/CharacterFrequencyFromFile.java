package com.frequency.character;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CharacterFrequencyFromFile {
	private FileInputStream fileInputStream;
	private int[] characterFrequencies;
	
	
	public CharacterFrequencyFromFile(String fileName) throws FileNotFoundException {
		fileInputStream = new FileInputStream(fileName);
		characterFrequencies = new int[128];
	}

	public FileInputStream getFileInputStream() {
		return fileInputStream;
	}
	
	public int[] getCharacterFrequencies() throws IOException {
		int character;
		while((character = fileInputStream.read()) != -1) {
			characterFrequencies[character] += 1;
		}
		
		return characterFrequencies;
	}
	
	public int getCharacterFrequency(char character) throws IOException {
		int ch, count = 0;
		while((ch = fileInputStream.read()) != -1) {
			if(character == (char)ch) count++;
		}
		
		return count;
	}
}
