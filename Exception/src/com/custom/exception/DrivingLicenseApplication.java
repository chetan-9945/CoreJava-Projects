package com.custom.exception;

public record DrivingLicenseApplication(int age) 
{

	public void validateAge(int age)
	{
		if(age<18)
		{
			throw new InvalidAgeException("Applicant is not eligible for a driving license");
		}
		else 
		{
			System.out.println("Eligible for driving license application.");
		}
	}
}
