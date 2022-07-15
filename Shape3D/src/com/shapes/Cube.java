package com.shapes;

public class Cube extends Shape3D {
	private double a;
	
	public Cube(double a) {
		this.a = a;
	}
	
	public double volume() {
		return Math.pow(a, 3);
	}
	
	public double surfaceArea() {
		return (6 * Math.pow(a, 2));
	}
}
