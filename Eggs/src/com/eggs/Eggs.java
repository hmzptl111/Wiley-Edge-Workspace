package com.eggs;

public class Eggs {
	private int n;
	private EggUnit eggUnit;
	

	public void setN(int n) {
		this.n = n;
	}
	
	public EggUnit getConvertedEggs() {
		convert();
		return eggUnit;
	}
	
	private void convert() {
		int gross, dozen, remainder;
		
		gross = this.n / 144;
		dozen = (this.n % 144) / 12;
		remainder = this.n - ((gross * 144) + (dozen * 12));
		
		eggUnit = new EggUnit();
		eggUnit.setGross(gross);
		eggUnit.setDozen(dozen);
		eggUnit.setRemainder(remainder);
	}
}