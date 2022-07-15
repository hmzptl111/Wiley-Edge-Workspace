package com.main;

import com.shapes.Cube;
import com.shapes.Cylinder;
import com.shapes.Shape3D;
import com.shapes.Sphere;

public class Main {

	public static void main(String[] args) {
		Shape3D cylinder = new Cylinder(3, 6);
		System.out.printf("Volume of cylinder: %.2f", cylinder.volume());
		System.out.printf("\nSurface area of cylinder: %.2f", cylinder.surfaceArea());
		
		Shape3D sphere = new Sphere(9);
		System.out.printf("\n\nVolume of sphere: %.2f", sphere.volume());
		System.out.printf("\nSurface area of sphere: %.2f", sphere.surfaceArea());
		
		
		Shape3D cube = new Cube(3);
		System.out.printf("\n\nVolume of cube: %.2f", cube.volume());
		System.out.printf("\nSurface area of cube: %.2f", cube.surfaceArea());
	}
}
