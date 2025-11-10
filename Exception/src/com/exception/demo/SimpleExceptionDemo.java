package com.exception.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.print("Enter the First number :");
			int a = sc.nextInt();
			System.out.print("Enter the Second number :");
			int b = sc.nextInt();
			System.out.print("Division :"+a/b);
		}
		catch(ArithmeticException | InputMismatchException e)
		{
			if(e instanceof ArithmeticException)
			{
				  System.out.println(e.getMessage());
				  System.out.println(e.toString());
				//e.printStackTrace();
				//System.err.println("Denometer can't be Zero...");
			}
			else
			{
				  System.out.println(e.getMessage());
				  System.out.println(e.toString());
				//e.printStackTrace();
				//System.err.println("Value must be Integer type only...");
			}
		}
		sc.close();
		
	}

}
