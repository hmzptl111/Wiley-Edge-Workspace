package com.palindrome.palindrome;

import com.hamza.reverse.Reverse;

public class Palindrome {
	int num;

	public void setNum(int num) {
		this.num = num;
	}

	public boolean isPalindrome() {
		Reverse reverse = new Reverse();
		reverse.setNum(num);
		
		return reverse.getRnum() == num;
	}
}
