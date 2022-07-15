package com.main;

import java.util.Scanner;

import com.draw.Circle;
import com.draw.Line;
import com.draw.Square;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Drawing a line");
		Line line = new Line();
		System.out.println("Press 1 to select brush color\nPress any other key to select default brush color");
		if(Integer.parseInt(sc.nextLine()) == 1) {
			System.out.print("Brush color: ");
			line.drawingColor(sc.nextLine());
			System.out.println("Press 1 to select brush thickness\nPress any other key to select default brush thickness");
			if(Integer.parseInt(sc.nextLine()) == 1) {
				System.out.print("Brush size: ");
				line.thickness(Integer.parseInt(sc.nextLine()));
			}
		}
		System.out.println("---------------------");
		line.draw();
		System.out.println("---------------------");
		
		
		
		System.out.println("Drawing a circle");
		Circle circle = new Circle();
		System.out.println("Press 1 to select brush color\nPress any other key to select default brush color");
		if(Integer.parseInt(sc.nextLine()) == 1) {
			System.out.print("Brush color: ");
			circle.drawingColor(sc.nextLine());
			System.out.println("Press 1 to select brush thickness\nPress any other key to select default brush thickness");
			if(Integer.parseInt(sc.nextLine()) == 1) {
				System.out.print("Brush size: ");
				circle.thickness(Integer.parseInt(sc.nextLine()));
			}
		}
		
		System.out.println("---------------------");
		
		System.out.println("Filling the circle");
		System.out.println("Press 1 to select fill color\nPress any other key to select default fill color");
		if(Integer.parseInt(sc.nextLine()) == 1) {
			System.out.print("Fill color: ");
			circle.fillingColor(sc.nextLine());
			System.out.println("Press 1 to select fill size\nPress any other key to select default fill size");
			if(Integer.parseInt(sc.nextLine()) == 1) {
				System.out.print("Fill size: ");
				circle.size(Integer.parseInt(sc.nextLine()));
			}
		}
		System.out.println("---------------------");
		circle.draw();
		circle.fill();
		System.out.println("---------------------");
		
		
		
		System.out.println("Drawing a square");
		Square square = new Square();
		System.out.println("Press 1 to select brush color\nPress any other key to select default brush color");
		if(Integer.parseInt(sc.nextLine()) == 1) {
			System.out.print("Brush color: ");
			square.drawingColor(sc.nextLine());
			System.out.println("Press 1 to select brush thickness\nPress any other key to select default brush thickness");
			if(Integer.parseInt(sc.nextLine()) == 1) {
				System.out.print("Brush size: ");
				square.thickness(Integer.parseInt(sc.nextLine()));
			}
		}
		
		System.out.println("---------------------");
		
		System.out.println("Filling the square");
		System.out.println("Press 1 to select fill color\nPress any other key to select default fill color");
		if(Integer.parseInt(sc.nextLine()) == 1) {
			System.out.print("Fill color: ");
			square.fillingColor(sc.nextLine());
			System.out.println("Press 1 to select fill size\nPress any other key to select default fill size");
			if(Integer.parseInt(sc.nextLine()) == 1) {
				System.out.print("Fill size: ");
				square.size(Integer.parseInt(sc.nextLine()));
			}
		}
		System.out.println("---------------------");
		square.draw();
		square.fill();
		System.out.println("---------------------");
		
		sc.close();
	}

}
