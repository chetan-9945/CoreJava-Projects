package com.arraylogical;

import java.util.Scanner;

public class EvenAndOddArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array :");
		int size = Integer.parseInt(sc.nextLine());
		
		int arr[] = new int[size];
		for(int i = 0;i < size; i++)
		{
			System.out.print("Enter the Array elements :-");
			arr[i]= Integer.parseInt(sc.nextLine());
		}
		sc.close();
		evenAndOdd(arr);
	}
	
	public static void evenAndOdd(int []arr)
	{
		System.out.print("Even elements are : ");
		for(int arrs : arr)
		{
			if(arrs%2==0)
			{ 
				System.out.print(arrs+" ");
			}
		}
		
		System.out.println();
		System.out.print("Odd elements are : ");
		for(int arrs : arr)
		{
			if(arrs%2!=0)
			{ 
				System.out.print(arrs+" ");
			}
		}
	
	}

}
