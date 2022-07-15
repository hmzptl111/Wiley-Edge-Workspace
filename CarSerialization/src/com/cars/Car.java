package com.cars;

import java.io.Serializable;

public class Car implements Serializable {
	private static final long serialVersionUID = 1L;
	private String model, color;

	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
