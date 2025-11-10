package com.abstraction_interface.polymorphism;

import java.util.Scanner;

public class TransportManagementSystem {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Vehicle for Operation:\r\n"
				+ "1) Truck\r\n"
				+ "2) Van\r\n"
				+ "3) Drone");
		System.out.print("Enter your Choice:");
		int choice = Integer.parseInt(sc.nextLine());
		double capacity = 0;
		int packages = 0;
		TransportVehicle tv = null;
		switch(choice)
		{
		case 1:
			System.out.print("enter the capacity");
			capacity = sc.nextDouble();
			System.out.print("Enter the packages");
			packages = sc.nextInt();
			System.out.println("Truck vehicle ready for operation.");
			tv = VehicleFactory.getVehicle(choice);
			tv.startEngine();
			tv.displayCapacity(capacity);
			tv.displayCapacity(packages);
			tv.fuelType();
			tv.scheduleService();
			tv.stopEngine();
		break;
		
		case 2:
			System.out.print("enter the capacity");
			capacity = sc.nextDouble();
			System.out.print("Enter the packages");
			packages = sc.nextInt();
			System.out.println("Van vehicle ready for operation.");
			tv = VehicleFactory.getVehicle(choice);
			tv.startEngine();
			tv.displayCapacity(capacity);
			tv.displayCapacity(packages);
			tv.fuelType();
			tv.scheduleService();
			tv.stopEngine();
		break;
		
		case 3:
			System.out.print("enter the capacity");
			capacity = sc.nextDouble();
			System.out.print("Enter the packages");
			packages = sc.nextInt();
			System.out.println("Drone vehicle ready for operation.");
			tv = VehicleFactory.getVehicle(choice);
			tv.startEngine();
			tv.displayCapacity(capacity);
			tv.displayCapacity(packages);
			tv.fuelType();
			tv.scheduleService();
			tv.stopEngine();
		break;
		
		default :
			System.out.println("Invalid Option. Please select a valid vehicle.");
			
		}
		
	}

}
