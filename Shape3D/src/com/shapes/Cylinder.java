package com.shapes;

public class Cylinder extends Shape3D {
	private double r, h;
	
	public Cylinder(double r, double h) {
		this.r = r;
		this.h = h;
	}
	
	public double volume() {
		return (Math.PI * Math.pow(r, 2) * h);
	}
	
	public double surfaceArea() {
		return ((2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r, 2)));
	}
}
