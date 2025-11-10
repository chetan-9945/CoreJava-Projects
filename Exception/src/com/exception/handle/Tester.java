package com.exception.handle;

//import java.util.Scanner;

public class Tester 
{
	public static void main(String[] args) 
	{
		ChildClass cl = new ChildClass();
		
		try
		{
			for(String arr : args)
			{
				cl.loadingClass(arr);
			}
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found...");
		}
	}
}
