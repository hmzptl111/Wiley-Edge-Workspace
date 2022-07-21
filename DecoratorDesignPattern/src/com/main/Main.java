package com.main;

import com.colorize.Colorize;
import com.shapes.Circle;
import com.shapes.Rectangle;
import com.shapes.Square;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Square square = new Square();
		Rectangle rectangle = new Rectangle();
		
		circle.draw();
		square.draw();
		rectangle.draw();
		
		Colorize colorize = new Colorize(square);
		colorize.colorize("Red");
	}
}
