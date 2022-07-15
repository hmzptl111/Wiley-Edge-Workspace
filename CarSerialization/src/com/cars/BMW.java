package com.cars;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BMW extends Car {
	private int horsePower;
	boolean isASportsCar;

	public BMW(String model, String color, int horsePower, boolean isASportsCar) {
		super(model, color);
		this.horsePower = horsePower;
		this.isASportsCar = isASportsCar;
	}
	
	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public boolean isASportsCar() {
		return isASportsCar;
	}

	public void setASportsCar(boolean isASportsCar) {
		this.isASportsCar = isASportsCar;
	}


	private void writeObject(ObjectOutputStream objectOutputStream) throws NotSerializableException {
		throw new NotSerializableException();
	}
	
	private void readObject(ObjectInputStream objectInputStream) throws NotSerializableException {
		throw new NotSerializableException();
	}
}
