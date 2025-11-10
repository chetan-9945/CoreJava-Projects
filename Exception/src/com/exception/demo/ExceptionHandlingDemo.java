package com.exception.demo;

import java.util.Scanner;

public class ExceptionHandlingDemo
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
		System.out.print("Enter the String :");
		String str= null;
		str = sc.nextLine();
		handleExceptions(str);
		}
	}
	
	public static void handleExceptions(String str)
	{
		try
		{
		   System.out.println("Length of the input string: "+str.length());
		   int length = Integer.parseInt(str);
		   System.out.println("Converted to integer: "+length);
		}
		catch(NullPointerException | NumberFormatException  e)
		{
			if(e instanceof NumberFormatException)
			{
				System.err.println("Given Input in Not a type of Integer Please check again once...");
			}
			else
			{
				NullPointerException nl = new NullPointerException("Input is null.");
				System.err.println(nl.getMessage());
				nl=null;
			}
		}
	}
	

}
