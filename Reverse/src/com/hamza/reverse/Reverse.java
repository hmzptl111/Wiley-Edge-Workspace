package com.hamza.reverse;

public class Reverse {
	private int num, rnum;

	public void setNum(int num) {
		this.num = num;
	}

	public int getRnum() {
		reverse();
		return rnum;
	}

	private void reverse() {
		int temp = num;
		while(temp != 0) {
			rnum = (rnum * 10) + (temp % 10);
			temp /= 10;
		}
	}
}
