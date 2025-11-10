package com.custom.exception;

import java.util.Scanner;

public class CarUser 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			
	    System.out.println("----------------------------------------------");
		System.out.println("Car Test\t - 1 \nCar Puncture\t - 2 \nCar Overheating\t - 3\nExit\t         - 4");
		System.out.print("Enter the your choice :");
		int choice = Integer.parseInt(sc.nextLine());
			
		switch(choice)
		{
		case 1 :
			System.out.print("Enter the test [Stop , go ] :");
			String choice1 = sc.nextLine();
			try
			{
				System.out.println("------------------------");
				CarTest.stop(choice1);
			}
			catch(CarStoppedException e)
			{
			
				System.err.println(e.getMessage());
			}
			break;
			
		case 2: 
			System.out.print("Enter the Car is Puncture Or Not :");
			choice1 = sc.nextLine();
			try 
			{
				
				CarTest.puncture(choice1);
			}
			catch(CarPunctureException e)
			{
				
				System.err.println(e.getMessage());
			}
			break;
			
		case 3 :
			System.out.print("Car Is Overheated Or Not :");
			int temp =0;
			try
			{
				temp = Integer.parseInt(sc.nextLine());
			}
			catch(NumberFormatException e)
			{
				System.out.println("------------------------");
				System.err.println("\tTemp Should be in Number Value only....");
				break;
			}
			
			try
			{
				CarTest.carHeat(temp);
			}
			catch(CarHeatException e)
			{
				System.out.println("------------------------");
				System.err.println(e.getMessage());
			}
			break;
			
		case 4 :
			System.out.println("------------------------");
			System.out.println(" Thanks for Using car services....");
			System.exit(0);
		}
				
		}
		
	}

}
