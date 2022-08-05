package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class PhoneBook {
	String name;
	long number;
	
	public PhoneBook(String name, long number) {
		this.name = name;
		this.number = number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneBook other = (PhoneBook) obj;
		return Objects.equals(name, other.name) && number == other.number;
	}
}

public class InternalWorkingOfHashMap {

	public static void main(String[] args) {
		Map<PhoneBook, String> map = new HashMap<>();
		
		map.put(new PhoneBook("hamza", 123), "hello");
		map.put(new PhoneBook("hamza", 123), "world");
		
		String result = map.get(new PhoneBook("hamza", 123));
		System.out.println(result);
		
//		PhoneBook pb1 = new PhoneBook("hamza", 123);
//		PhoneBook pb2 = new PhoneBook("hamza", 123);
//		if(pb1.equals(pb2)) {
//			System.out.println("pb1 = pb2");
//		}
//		if(pb1.hashCode() == pb2.hashCode()) {
//			System.out.println("pb1 hash code = pb2 hash code");
//		}
	}
}