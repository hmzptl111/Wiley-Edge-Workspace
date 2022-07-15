package com.draw;

import com.drawable.Drawable;

public class Line implements Drawable {
	public String drawingColor = "black";
	public int brushThickness = 1;
	
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
		System.out.println("Drawing " + drawingColor + " colored line with brush thickness " + brushThickness);
	}
}
