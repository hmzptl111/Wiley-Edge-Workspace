package com.file.input;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
	private FileInputStream fileInputStream;
	private String content;
	
	public ReadFile(String fileName) throws IOException {
		fileInputStream = new FileInputStream(fileName);
		content = readFileContentAsString();
	}

	public String getContent() {
		return content;
	}
	
	private String readFileContentAsString() throws IOException {
		StringBuilder sb = new StringBuilder();
		int character;
		while((character = fileInputStream.read()) != -1) {
			sb.append((char) character);
		}
		
		return sb.toString();
	}
}
