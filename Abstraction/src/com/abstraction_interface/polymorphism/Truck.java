package com.abstraction_interface.polymorphism;

public class Truck extends TransportVehicle
{

	@Override
	public void startEngine() 
	{
		System.out.println("Starting Truck engine...");
	}

	@Override
	public void stopEngine() 
	{
		System.out.println("Stopping Truck engine...");
	}

	@Override
	public void scheduleService() 
	{
		System.out.println("Next service scheduled in 30 days.");
	}

	@Override
	public void fuelType() 
	{
		System.out.println("Fuel Type: Diesel");
	}
	
	@Override
	public void displayCapacity(double capacity)
	{
		System.out.println("Truck capacity: "+capacity+"kg");
	}
	
	@Override
	public void displayCapacity(int packages)
	{
		System.out.println("Truck can carry "+packages+" packages.");
	}
	

}
