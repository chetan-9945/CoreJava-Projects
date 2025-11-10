package com.arraylogical;

import java.util.Scanner;

public class MiddleArray {

	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the size of an array :");
			int size = 0;
			try
			{
			size = Integer.parseInt(sc.nextLine());
			}
			catch(NumberFormatException e)
			{
				System.out.println(e.getMessage());
			}
			
			int []arr = new int[size];
			
			for(int i=0;i<size;i++)
			{
				System.out.print("Enter the Array elements :-");
				try
				{
					arr[i] = Integer.parseInt(sc.nextLine());
				}
				catch(NumberFormatException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			try
			{
				findMiddle(arr);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	public static void findMiddle(int []arr)
	{
		if(arr.length%2==0)
		{
			System.out.println("output is : "+arr[arr.length/2-1] +" "+arr[arr.length/2]);
		}
		else
		{
			System.out.println("output is : "+arr[arr.length/2]);
		}
	}

}
