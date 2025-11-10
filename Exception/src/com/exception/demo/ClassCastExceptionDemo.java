package com.exception.demo;

import java.util.Scanner;

public class ClassCastExceptionDemo 
{

	public static void main(String[] args) 
	{
		try
		{
			handleClassCastException();
		}
		catch(ClassCastException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void handleClassCastException()
	{
		Scanner sc = new Scanner(System.in);
		Object arr [] = {"Hello",123,"Java"};
		
//		for(int i=0; i<=arr.length; i++)
//		{
//			arr[i] = sc.nextLine();
//		}
		
		for(Object arrs : arr )
		{
			 String res=(String) arrs;
			 System.out.println("Type casted successfully : "+res);   
		}
	}

}
