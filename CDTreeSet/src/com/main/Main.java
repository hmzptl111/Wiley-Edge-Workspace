package com.main;

import java.time.LocalTime;
import java.util.Set;
import java.util.TreeSet;

import com.cd.CD;

public class Main {

	public static void main(String[] args) {
		Set<CD> CDs = new TreeSet<>();
		
		CDs.add(new CD(1, "abc", "xyz", LocalTime.of(5, 30)));
		CDs.add(new CD(2, "xoxo", "pqr", LocalTime.of(6, 15)));
		CDs.add(new CD(3, "asdf", "mno", LocalTime.of(2, 00)));
		
		for(CD cd: CDs) {
			System.out.println(cd);
		}
	}
}