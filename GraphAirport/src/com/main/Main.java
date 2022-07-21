package com.main;

import com.airport.Airport;
import com.airport.Airports;

public class Main {

	public static void main(String[] args) {
		Airports airports = new Airports();
		
		Airport delhi = new Airport("Delhi", 25000, true, true);
		Airport mumbai = new Airport("Mumbai", 35000, true, true);
		Airport chennai = new Airport("Chennai", 15000, true, true);
		Airport indore = new Airport("Indore", 9000, true, false);
		Airport patna = new Airport("Patna", 8000, false, false);
		
		airports.connectAirports(delhi, mumbai, 2, true);
		airports.connectAirports(delhi, indore, 1, false);
		airports.connectAirports(delhi, patna, 3, false);
		//Delhi and Patna are already connected
		airports.connectAirports(delhi, patna, 3, false);
		
		airports.connectAirports(patna, indore, 2, false);
		airports.connectAirports(patna, chennai, 2.5, false);
		
		airports.connectAirports(chennai, mumbai, 3, false);
		
		System.out.println(airports);
		
		System.out.println("Depth-First Search");
		airports.DFS(patna);
		System.out.println();
		System.out.println();
		
		System.out.println("Breadth-First Search");
		airports.BFS(delhi);
		System.out.println();
	}

}
