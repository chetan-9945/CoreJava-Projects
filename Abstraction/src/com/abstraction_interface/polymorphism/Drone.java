package com.abstraction_interface.polymorphism;

public class Drone extends TransportVehicle {

	@Override
	public void startEngine() 
	{
		System.out.println("Starting Drone engine...");
	}

	@Override
	public void stopEngine() 
	{
		System.out.println("Stopping Drone engine...");
	}

	@Override
	public void scheduleService() 
	{
		System.out.println("Next service scheduled in 15 days.");
	}

	@Override
	public void fuelType() 
	{
		System.out.println("Fuel Type: Battery");
	}
	
	@Override
	public void displayCapacity(double capacity)
	{
		System.out.println("Drone capacity: "+capacity+"kg");
	}
	
	@Override
	public void displayCapacity(int packages)
	{
		System.out.println("Drone can carry "+packages+" packages.");
	}

}
