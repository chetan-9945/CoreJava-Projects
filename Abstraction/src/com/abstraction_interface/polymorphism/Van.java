package com.abstraction_interface.polymorphism;

public class Van extends TransportVehicle 
{

	@Override
	public void startEngine() 
	{
		System.out.println("Starting Van engine...");
	}

	@Override
	public void stopEngine() 
	{
		System.out.println("Stopping Van engine...");
	}

	@Override
	public void scheduleService() 
	{
		System.out.println("Van can carry 10 packages.");
	}

	@Override
	public void fuelType() 
	{
		System.out.println("Fuel Type: Petrol");
	}
	
	@Override
	public void displayCapacity(double capacity)
	{
		System.out.println("Van capacity: "+capacity+"kg");
	}
	
	@Override
	public void displayCapacity(int packages)
	{
		System.out.println("Van can carry "+packages+" packages.");
	}
}
