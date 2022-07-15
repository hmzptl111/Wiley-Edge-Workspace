package com.enumerator;

public enum Dish {
	SUSHI(500, 5000, 500, false),
	PIZZA(400, 499, 300, false),
	PANEER_TIKKA(600, 600, 200, true);
	
	private int calories;
	private int price;
	private int quantity;
	private boolean isVeg;
	
	private Dish(int calories, int price, int quantity, boolean isVeg) {
		this.calories = calories;
		this.price = price;
		this.quantity = quantity;
	}

	public int getCalories() {
		return calories;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public boolean isVeg() {
		return isVeg;
	}

	
	
}
