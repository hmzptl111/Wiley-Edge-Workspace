package com.main;

import java.util.Scanner;
import com.retail.Retail;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many orders/records do you have?");
		int n = sc.nextInt();
		
		double total = 0;
		Retail retail = new Retail();
		while(n > 0) {
			int pId = sc.nextInt();
			int pQuantity = sc.nextInt();
			
			switch(pId) {
				case 1:
					total += retail.getProductOnePrice() * pQuantity;
					break;
				case 2:
					total += retail.getProductTwoPrice() * pQuantity;
					break;
				case 3:
					total += retail.getProductThreePrice() * pQuantity;
					break;
				default:
					System.out.println("Incorrect product ID, please try again...");
					n++;
			}
			
			n--;
		}
		System.out.println("The total retail value of all products: " + total);
		sc.close();
	}

}
