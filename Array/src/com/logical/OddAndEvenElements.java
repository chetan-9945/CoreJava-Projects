package com.logical;

//Write a java program to print all even elements and odd elements 
//separately from an array.
//
//Input as  : 1 2 3 4 5 6 7
//Even elements are : 2 4 6
//Odd elements are : 1 3 5 7

public class OddAndEvenElements {

	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.print("Even Elements from arrays ");
		
		for(int arrs : arr)
		{
			if(arrs%2==0)
			{
				System.out.print(arrs+"  ");
			}
		}
		System.out.println();
		
		System.out.print("Odd Elements from arrays ");
		
		for(int arrs : arr)
		{
			if(arrs%2!=0)
			{
				System.out.print(arrs+"  ");
			}
		}
	}

}
