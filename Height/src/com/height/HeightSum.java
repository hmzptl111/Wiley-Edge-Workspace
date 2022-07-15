package com.height;

public class HeightSum {
	private Height ht1;
	private Height ht2;
	private Height sumOfHeights;
	
	public void setHt1(Height ht1) {
		this.ht1 = ht1;
	}
	
	public void setHt2(Height ht2) {
		this.ht2 = ht2;
	}
	
	public Height getSumOfHeights() {
		calculateSum();
		return sumOfHeights;
	}
	
	private void calculateSum() {
//		sumOfHeights = new Height();
//		sumOfHeights.ft = ht1.ft + ht2.ft;
//		sumOfHeights.in = ht1.in + ht2.in;
		
		sumOfHeights = new Height(ht1.ft + ht2.ft, ht1.in + ht2.in);
	}
}
