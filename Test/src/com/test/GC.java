package com.test;

class Dozens {
	int data;
}

public class GC {
	public static void main(String[] args) {
		Dozens[] da = new Dozens[3];
		for(Dozens d: da) {
			if(d == null) {
				System.out.println("null");
			} else {
				System.out.println("not null");
			}
		}
	}
}