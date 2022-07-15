package com.drivers;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.cars.Audi;
import com.cars.BMW;

public class Driver implements Serializable {
	private String name;
	private Audi audi;
	transient private BMW bmw;
	
	public Driver(String name, Audi audi, BMW bmw) {
		this.name = name;
		this.audi = audi;
		this.bmw = bmw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Audi getAudi() {
		return audi;
	}

	public void setAudi(Audi audi) {
		this.audi = audi;
	}

	public BMW getBMW() {
		return bmw;
	}

	public void setBMW(BMW bmw) {
		this.bmw = bmw;
	}
	
	private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException{
		objectInputStream.defaultReadObject();
		bmw = new BMW((String) objectInputStream.readObject(), (String) objectInputStream.readObject(), (int) objectInputStream.readObject(), (boolean) objectInputStream.readObject());
	}
	
	private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
		objectOutputStream.defaultWriteObject();
		objectOutputStream.writeObject(bmw.getModel());
		objectOutputStream.writeObject(bmw.getColor());
		objectOutputStream.writeObject(bmw.getHorsePower());
		objectOutputStream.writeObject(bmw.isASportsCar());
	}
}
