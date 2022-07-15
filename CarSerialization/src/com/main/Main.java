package com.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.cars.Audi;
import com.cars.BMW;
import com.drivers.Driver;

public class Main {

	public static void main(String[] args) {
		Audi audi = new Audi("Audi RS Q8", "Black", 591);
		BMW bmw = new BMW("BMW M8 E31", "White", 640, false);
		Driver driver1 = new Driver("Hamza", audi, bmw);
		
		try(FileOutputStream fileOutputStream = new FileOutputStream("cars");
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
			
			objectOutputStream.writeObject(driver1);
			System.out.println("Driver stored");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try(FileInputStream fileInputStream = new FileInputStream("cars");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
			
			Driver driver = (Driver) objectInputStream.readObject();
			System.out.println("Driver name: " + driver.getName());
			
			System.out.println("Audi model: " + driver.getAudi().getModel());
			System.out.println("Audi color: " + driver.getAudi().getColor());
			System.out.println("Audi horsepower: " + driver.getAudi().getHorsePower());
			
			System.out.println("BMW model: " + driver.getBMW().getModel());
			System.out.println("BMW color: " + driver.getBMW().getColor());
			System.out.println("BMW horsepower: " + driver.getBMW().getHorsePower());
			System.out.println("is BMW a sports car: " + driver.getBMW().isASportsCar());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}