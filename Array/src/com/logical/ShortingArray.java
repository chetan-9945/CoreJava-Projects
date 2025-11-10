package com.logical;

import java.util.Arrays;

//Write a java program to sort the given array.
//
//input : {7,1,2,5,3,6,4}
//output : 1,2,3,4,5,6,7

public class ShortingArray 
{

	public static void main(String[] args)
	{
		int arr[] = {7,1,2,5,3,6,4};
		
		System.out.println("Sorted array :"+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{ 
			int temp =0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted array :"+Arrays.toString(arr));
	}

}
