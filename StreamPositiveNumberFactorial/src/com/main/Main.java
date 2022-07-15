package com.main;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static int factorial(int n) {
		if(n == 1) return 1;
		
		return (n * factorial(n - 1));
	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 6, 9, -1, 19, -3);
		
		//could remove filter and change base case of factorial to n >= 1, keeping it just to showcase the use of filter
		numbers.stream()
		.filter(n -> n > 0)
		.map(Main::factorial)
		.forEach(System.out::println);
	}
}