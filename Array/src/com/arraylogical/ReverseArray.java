package com.arraylogical;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array Size :");
		int size = Integer.parseInt(sc.nextLine());
		int arr[]= new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter the Arrat elements :");
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		int res []= reverse(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int[] reverse(int []arr)
	{
		for(int i=0;i<arr.length/2;i++)
		{ 
			int temp=0;
			temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		return arr;
	}

}
