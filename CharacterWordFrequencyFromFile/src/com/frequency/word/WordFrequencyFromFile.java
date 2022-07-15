package com.frequency.word;

import java.io.FileInputStream;
import java.io.IOException;

import com.frequency.bean.Word;

public class WordFrequencyFromFile {
	private FileInputStream fileInputStream;
	private String content;
	
	
	public WordFrequencyFromFile(String fileName) throws IOException {
		fileInputStream = new FileInputStream(fileName);
		this.content = readFileContentAsString();
	}

	public FileInputStream getFileInputStream() {
		return fileInputStream;
	}
	
	public Word[] getWordFrequencies() throws IOException {
		// index for "words" as we don't know how many words are available in "words" and how many are null
		int i = 0;
//		"[\\s,]+"
		String[] wordsList = content.trim().split("[\\s,.\\n]+");
		Word[] words = new Word[1024];
		
		for(int j = 0; j < wordsList.length; j++) {
			boolean wordExists = false;
			for(int k = 0; k < words.length; k++) {
				if(words[k] == null) break;
				
				if(words[k].getWord().compareTo(wordsList[j]) == 0) {
					words[k].incrementWordFrequency();
					wordExists = true;
					break;
				}
			}
			
			if(!wordExists) {
				Word newWord = new Word(wordsList[j].trim());
				words[i] = newWord;
				i++;									
			}
		}
		
		return words;
	}
	
	public String readFileContentAsString() throws IOException {
		// index for "chars" as we don't know how many characters are valuable and how many are default
		int i = 0;
		// assuming the file content has less than or equal to 1024 characters
		char[] chars = new char[1024];
		int ch;
		while((ch = fileInputStream.read()) != -1) {
			chars[i] = (char)ch;
			i++;
		}
		
//		return String.valueOf(chars);
		return new String(chars);
	}
	
	public int getWordFrequency(String word) throws IOException {
		Word[] words = getWordFrequencies();
		for(int i = 0; i < words.length; i++) {
			if(words[i] == null) break;
			
			if(words[i].getWord().compareTo(word) == 0) return words[i].getFrequency();
		}
		
		return -1;
	}
}
