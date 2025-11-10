package com.logical;

import java.util.Arrays;

//Write a java program to sort array in range of index of array.
//input : {10,4,2,3,1,200,8,7,5,-1};
//input index : 0 4
//output : 1,2,3,4,10,200,8,7,5,-1

import java.util.Scanner;

public class ArraySortGivenIndex 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,4,2,3,1,200,8,7,5,-1};
		System.out.print("Enter the start index :");
		int start = Integer.parseInt(sc.nextLine());
		System.out.print("Enter the End index :");
		int end = Integer.parseInt(sc.nextLine());
		System.out.println("Before Sort :"+Arrays.toString(arr));
		for(int i=start;i<end;i++)
		{
			int temp = 0;
			for(int j=i+1;j<end;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Before Sort :"+Arrays.toString(arr));
	}

}
