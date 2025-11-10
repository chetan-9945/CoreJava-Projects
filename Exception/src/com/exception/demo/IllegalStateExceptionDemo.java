package com.exception.demo;

import java.util.Scanner;

public class IllegalStateExceptionDemo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		throwIllegalException();
		sc.close();
	}
	
	static void throwIllegalException() 
	{
	    try 
	    {
	        throw new IllegalStateException("MyException");
	     } 
	    catch (IllegalStateException objA) 
	     {
	           System.out.println("Caught: " + objA);
	     }
	 }
	
}
