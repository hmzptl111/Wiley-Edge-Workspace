package com.test;

import java.util.function.*;

@FunctionalInterface
interface Calculate {
	public int fact(int n);
}

public class LambdaImplementation {
	public static void main(String[] args) {
		Calculate f = n -> {
			int fact = 1;
			for(int i = 2; i <= n; i++) {
				fact *= i;
			}
			return fact;
		};
		
		System.out.println(f.fact(5));
		
//		IntUnaryOperator fact = n -> {
//			int f = 1;
//			for(int i = 2; i <= n; i++) {
//				f *= i;
//			}
//			return f;
//		};
//		System.out.println(fact.applyAsInt(5));
	}
}
