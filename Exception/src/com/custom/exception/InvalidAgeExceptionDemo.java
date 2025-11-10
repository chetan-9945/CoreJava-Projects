package com.custom.exception;

import java.util.Scanner;

public class InvalidAgeExceptionDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Age :");
		int age = sc.nextInt();
		
		try(sc)
		{
			DrivingLicenseApplication dl = new DrivingLicenseApplication(age);
			dl.validateAge(age);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
