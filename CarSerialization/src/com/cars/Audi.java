package com.cars;

public class Audi extends Car {
	private int horsePower;

	public Audi(String model, String color, int horsePower) {
		super(model, color);
		this.horsePower = horsePower;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
}
