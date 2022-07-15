package com.main;

import com.sample.Sample;

public class Main {

	public static void main(String[] args) {
		System.out.println(Sample.noOfObjects);
		
		new Sample();
		System.out.println(Sample.noOfObjects);
		
		new Sample();
		System.out.println(Sample.noOfObjects);
		
		new Sample();
		System.out.println(Sample.noOfObjects);
	}
}
