package com.main;

import com.calculate.Calculate;

import java.util.function.*;

public class Main {

	public static void main(String[] args) {
//		Calculate factorial = (n) -> {
//			int fact = 1;
//			for(int i = 2; i <= n; i++) {
//				fact *= i;
//			}
//			return fact;
//		};
		
//		Calculate reverse = (n) -> {
//			int r = 0;
//			while(n != 0) {
//				r = (r * 10) + (n % 10);
//				n /= 10;
//			}
//			return r;
//		};

		IntUnaryOperator factorial = n -> {
			int fact = 1;
			for(int i = 2; i <= n; i++) {
				fact *= i;
			}
			return fact;
		};
		
		IntUnaryOperator reverse = n -> {
			int r = 0;
			while(n != 0) {
				r = (r * 10) + (n % 10);
				n /= 10;
			}
			return r;
		};
		
		System.out.println(factorial.applyAsInt(5));
		System.out.println(reverse.applyAsInt(1234));
	}
}