package com.colorize;

import com.shape.Shape;
import com.shape.ShapeContract;

public class Colorize implements ShapeContract {
	private Shape shape;
	
	public Colorize(Shape shape) {
		this.shape = shape;
	}
	
	@Override
	public void draw() {
		shape.draw();
	}
	
	public void colorize(String color) {
		System.out.print(" with " + color + " color\n");
	}
}
