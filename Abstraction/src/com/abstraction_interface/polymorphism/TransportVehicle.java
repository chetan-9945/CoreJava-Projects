package com.abstraction_interface.polymorphism;

public abstract class TransportVehicle implements VehicleOperations, MaintenanceSchedule 
{
  public abstract void fuelType();
  
  public void displayCapacity(double capacity)
  {
	  System.out.println("vehicle capacity :"+capacity);
  }
  
  
  public void displayCapacity(int packages)
  {
	  System.out.println("vehicle can caryy "+packages+" packages.");
  }


}
