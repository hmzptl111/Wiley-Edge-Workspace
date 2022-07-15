package com.main;

import com.lomboktest.LombokTest;

public class Main {

	public static void main(String[] args) {
		LombokTest lt1 = new LombokTest();
		LombokTest lt2 = new LombokTest(1, "hamza");
		
		System.out.println(lt2);
	}
}
