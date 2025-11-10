package com.logical;

import java.util.Arrays;
import java.util.Scanner;

//Print all elements in reverse order of an Array.
//
//Input as: 1 2 3 4 5
//Output as: 5 4 3 2 1

public class ReverseOrder
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,2,3,4,5};
		int temp = 0;
		
		for(int i=0;i<arr.length/2;i++)
		{
			temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		
		System.out.println("Reverse Order :"+Arrays.toString(arr));

}
	}
