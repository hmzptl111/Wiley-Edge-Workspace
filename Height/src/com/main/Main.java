package com.main;

import java.util.Scanner;

import com.height.Height;
import com.height.HeightSum;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ft1 = sc.nextInt(), in1 = sc.nextInt(), ft2 = sc.nextInt(), in2 = sc.nextInt();
		
		while(ft1 < 0 || in1 < 0 || ft2 < 0 || in2 < 0) {
			System.out.println("Height units cannot be negative, please try again...");
			ft1 = sc.nextInt();
			in1 = sc.nextInt();
			ft2 = sc.nextInt();
			in2 = sc.nextInt();
		}
		
		if(in1 >= 12) {
			ft1 += (in1 / 12);
			in1 %= 12;
		}
		if(in2 >= 12) {
			ft2 += (in2 / 12);
			in2 %= 12;
		}
		
//		Height ht1 = new Height();
//		ht1.setFt(ft1);
//		ht1.setIn(in1);
//		
//		Height ht2 = new Height();
//		ht2.setFt(ft2);
//		ht2.setIn(in2);
		
		Height ht1 = new Height(ft1, in1);
		
		Height ht2 = new Height(ft2, in2);
		
		Height ht3 = ht1.addHeights(ht2);
		System.out.println("Using method in the same class:");
		System.out.println(ft1 + "ft. " + in1 + "in. + " + ft2 + "ft. " + in2 + "in. = " + ht3.getFt() + "ft. " + ht3.getIn() + "in.");
		
		
		HeightSum hs = new HeightSum();
		hs.setHt1(ht1);
		hs.setHt2(ht2);
		Height ht4 = hs.getSumOfHeights();
		System.out.println("Using a different class:");
		System.out.println(ft1 + "ft. " + in1 + "in. + " + ft2 + "ft. " + in2 + "in. = " + ht4.getFt() + "ft. " + ht4.getIn() + "in.");
		
	}

}
