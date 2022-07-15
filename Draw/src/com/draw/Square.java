package com.draw;

import com.drawable.Drawable;
import com.fillable.Fillable;

public class Square implements Drawable, Fillable {
	public String drawingColor = "black";
	public int brushThickness = 1;
	public String fillingColor = "black";
	public int fillSize = 1;

	@Override
	public void fillingColor(String fillingColor) {
		this.fillingColor = fillingColor;
	}

	@Override
	public void size(int fillSize) {
		this.fillSize = fillSize;
	}

	@Override
	public void drawingColor(String drawingColor) {
		this.drawingColor = drawingColor;
	}

	@Override
	public void thickness(int brushThickness) {
		this.brushThickness = brushThickness;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing " + drawingColor + " colored square with brush thickness " + brushThickness);
	}
	
	@Override
	public void fill() {
		System.out.println("Filling square of size " + fillSize + " units with " + fillingColor + " color");
	}
}
