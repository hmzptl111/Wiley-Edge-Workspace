package com.airport;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Airport {
	private String name;
	private double area; //in km
	private boolean isMetropolitan, supportsInternationFlights;
	private List<Airport> connectedAirports = new LinkedList<>();
	
	public Airport(String name, double area, boolean isMetropolitan, boolean supportsInternationFlights) {
		this.name = name;
		this.area = area;
		this.isMetropolitan = isMetropolitan;
		this.supportsInternationFlights = supportsInternationFlights;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isMetropolitan() {
		return isMetropolitan;
	}

	public void setMetropolitan(boolean isMetropolitan) {
		this.isMetropolitan = isMetropolitan;
	}

	public boolean isSupportsInternationFlights() {
		return supportsInternationFlights;
	}

	public void setSupportsInternationFlights(boolean supportsInternationFlights) {
		this.supportsInternationFlights = supportsInternationFlights;
	}

	public List<Airport> getConnectedAirports() {
		return connectedAirports;
	}

	public void setConnectedAirports(List<Airport> connectedAirports) {
		this.connectedAirports = connectedAirports;
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, connectedAirports, isMetropolitan, name, supportsInternationFlights);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airport other = (Airport) obj;
		return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area)
				&& Objects.equals(connectedAirports, other.connectedAirports) && isMetropolitan == other.isMetropolitan
				&& Objects.equals(name, other.name) && supportsInternationFlights == other.supportsInternationFlights;
	}
}
