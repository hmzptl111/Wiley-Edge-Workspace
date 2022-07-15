package org.animals;

public class Deer {
	private String color;
	private float weight;
	private int age;
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	public boolean isVegetarian() {
		return true;
	}
	
	public boolean canClimb() {
		return false;
	}
	
	public String sound() {
		return "Bellow";
	}
}
