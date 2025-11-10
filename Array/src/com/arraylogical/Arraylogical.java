package com.arraylogical;

import java.util.Scanner;

public class Arraylogical {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size :");
		int size = Integer.parseInt(sc.nextLine());
		int arr[] = new int[size];
		
		for(int i=0;i<arr.length;i++)
			{
			System.out.print("Enter the array element :"+i +" :-");
		        arr[i]= Integer.parseInt(sc.nextLine());
			}
		
		int res =search(arr,sc);
		if(res!=0)
		{
			System.out.println("Element found at index "+res);
		}
		else
		{
			System.out.println("Element not found");
		}
	}
	
	public static int search(int []arr,Scanner sc)
	{
		
		System.out.print("Enter the search element :");
		int search =  Integer.parseInt(sc.nextLine());
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
			   return i;
			}
		}
		return 0;
	}
	
	

}
