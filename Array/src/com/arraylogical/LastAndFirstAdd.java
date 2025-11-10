package com.arraylogical;

import java.util.Scanner;

public class LastAndFirstAdd {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size :");
		int size = Integer.parseInt(sc.nextLine());
		int arr[]= new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter the Arrat elements :");
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.print("The Addition is :"+addingLastAndFirst(arr, sc));
		
	}
	
	public static int addingLastAndFirst(int []arr,Scanner sc)
	{
		return arr[0] +arr[arr.length-1];
	}

}
