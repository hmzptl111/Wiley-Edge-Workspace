package com.lamdamethodreference;

import java.util.function.*;

public class LamdaMethodReference {

	public static void main(String[] args) {
		BiFunction<String, String, Integer> lamda = (s1, s2) -> s1.compareTo(s2);
		System.out.println(lamda.apply("a", "a"));
		
		BiFunction<String, String, Integer> methodReference = String::compareTo;
		System.out.println(methodReference.apply("b", "a"));
	}
}