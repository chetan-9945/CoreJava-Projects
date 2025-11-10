package com.custom.exception;

public class CarTest 
{
	public static void stop(String message) throws CarStoppedException 
	{
		if(message.equalsIgnoreCase("stop"))
		{
		throw new CarStoppedException("Car stopped for some reason.");
		}
		else
		{
			System.out.println("------------------------");
			System.out.println("Car not stopped.");
		}
	}
	
	public static void puncture(String message) throws CarPunctureException
	{
		if(message.equalsIgnoreCase("puncture"))
		{
			throw new CarPunctureException("Car is punctured");
		}
		else
		{
			System.out.println("------------------------");
			System.out.println("Car not stall.");
		}
	}
	
	public static void carHeat(int temp) throws CarHeatException
	{
		if(temp > 50)
		{
			throw new CarHeatException("Car is heated more the 50 degrees");
		}
		else
		{
			System.out.println("------------------------");
			System.out.println("Car temperature normal.");
		}
	}
	
}
