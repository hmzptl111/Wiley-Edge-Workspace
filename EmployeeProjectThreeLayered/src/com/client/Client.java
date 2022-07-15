package com.client;

import com.presentation.EmployeeProjectPresentationImpl;

public class Client {

	public static void main(String[] args) {
		EmployeeProjectPresentationImpl epi = new EmployeeProjectPresentationImpl();
		
		while(true) {
			epi.menu();
		}
	}
}