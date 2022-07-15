package com.shapes;

public class Sphere extends Shape3D {
	private double r;
	
	public Sphere(double r) {
		this.r = r;
	}
	
	public double volume() {
		return ((4 / 3) * Math.PI * r * Math.pow(r, 3));
	}
	
	public double surfaceArea() {
		return (4 * Math.PI * Math.pow(r, 2));
	}
}
