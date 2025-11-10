package com.exception.demo;

import java.util.Scanner;

public class ArrayIndexExceptionDemo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			int a[] = new int[2];
			a[0] = 10;
			a[1] = 20;
			
			System.out.print("Enter the Array index :");
			int n = sc.nextInt();
			System.out.println("Array Index is :"+a[n]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			   System.err.println(e.getMessage());
			  // System.out.println(e.toString());
			  //e.printStackTrace();
		}
		sc.close();

	}

}
