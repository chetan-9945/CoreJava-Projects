package com.exception.demo;

import java.util.Scanner;

public class AreaCalculator 
{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the length :");
			double length = sc.nextDouble();
			System.out.print("Enter the width :");
			double width = sc.nextDouble();
			try {
				if(length <1 || width <1 )
				{
					throw new IllegalArgumentException("Error: Length and width must be > 0.");
				}
				System.out.println("Area of rectangle with length "+length+" and width "+width+" is: "+calculateArea(length,width));
			}
			catch(IllegalArgumentException e)
			{
				System.out.println(e);
			}
			
	}
	
	public static double calculateArea(double length,double width)
	{
		return length*width;
	}

}
