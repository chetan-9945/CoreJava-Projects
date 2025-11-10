package com.exception.demo;

import java.util.Scanner;

public class ClassNotFoundExpDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the class name :");
		String className = sc.nextLine();
		
		ClassNotFoundExpDemo dp = new ClassNotFoundExpDemo(className);
	}
	
	public ClassNotFoundExpDemo(String className)
	{
		try
		{
			Class.forName(className);
			System.out.println("Class loaded successfully: "+className);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
