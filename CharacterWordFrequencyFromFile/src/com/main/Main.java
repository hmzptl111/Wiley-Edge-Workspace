package com.main;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.frequency.bean.Word;
import com.frequency.character.CharacterFrequencyFromFile;
import com.frequency.word.WordFrequencyFromFile;

public class Main {

	public static void main(String[] args) {
		try {
//			CharacterFrequencyFromFile cfff = new CharacterFrequencyFromFile("test");
//			int[] characterFrequencies = cfff.getCharacterFrequencies();
//			
//			for(int i = 0; i < characterFrequencies.length; i++) {
//				if(characterFrequencies[i] != 0) {
//					System.out.println((char)i + ": " + characterFrequencies[i]);					
//				}
//			}
			
//			int charFrequency = cfff.getCharacterFrequency('h');
//			System.out.println(charFrequency);
			
			
			WordFrequencyFromFile wfff = new WordFrequencyFromFile("test");
			Word[] wordFrequencies = wfff.getWordFrequencies();
			
			for(int i = 0; i < wordFrequencies.length; i++) {
				if(wordFrequencies[i] == null) break;
				
				System.out.println(wordFrequencies[i].getWord() + ": " + wordFrequencies[i].getFrequency());
			}
			
//			int wordCount = wfff.getWordFrequency("one");
//			System.out.println("Frequency of word 'one' is " + wordCount);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
