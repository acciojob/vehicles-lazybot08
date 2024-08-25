package com.driver;

public class Boat implements WaterVehicle {
	private String name;
	private int capacity;
	
	public Boat() {
		
	}
	
	public Boat(String name,int capacity) {
		this.name = name;
		this.capacity = capacity;
	}

	@Override
	public String getVehicleName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getVehicleCapacity() {
		// TODO Auto-generated method stub
		return this.capacity;
	}

}
