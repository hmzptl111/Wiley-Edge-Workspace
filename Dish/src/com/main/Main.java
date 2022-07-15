package com.main;

import com.enumerator.Dish;

public class Main {

	public static void main(String[] args) {
		Dish sushi = Dish.SUSHI;
		System.out.println("Sushi");
		System.out.println("Calories: " + sushi.getCalories() + "calories");
		System.out.println("Price: Rs." + sushi.getPrice());
		System.out.println("Quantity: " + sushi.getQuantity() + " grams");
		
		
		Dish pizza = Dish.PIZZA;
		System.out.println("Pizza");
		System.out.println("Calories: " + pizza.getCalories() + "calories");
		System.out.println("Price: Rs." + pizza.getPrice());
		System.out.println("Quantity: " + pizza.getQuantity() + "grams");
		

		Dish paneerTikka = Dish.PANEER_TIKKA;
		System.out.println("Paneer Tikka");
		System.out.println("Calories: " + paneerTikka.getCalories() + "calories");
		System.out.println("Price: Rs." + paneerTikka.getPrice());
		System.out.println("Quantity: " + paneerTikka.getQuantity() + "grams");
	}

}
