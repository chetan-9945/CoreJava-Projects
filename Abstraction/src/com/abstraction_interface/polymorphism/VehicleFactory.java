package com.abstraction_interface.polymorphism;

public class VehicleFactory 
{
	public static TransportVehicle getVehicle(int choice)
	{
		if(choice == 1)
		{
			return new Truck();
		}
		else if(choice == 2)
		{
			return new Van();
		}
		else
		{
			return new Drone();
		}
	}
	
}
