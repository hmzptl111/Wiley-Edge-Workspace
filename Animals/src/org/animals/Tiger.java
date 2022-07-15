package org.animals;

public class Tiger {
	String color;
	float weight;
	int age;
	
	
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
		return false;
	}
	
	public boolean canClimb() {
		return true;
	}
	
	public String sound() {
		return "Roar";
	}
}
