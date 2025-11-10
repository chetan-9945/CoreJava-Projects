package com.array.demo;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Integer []arr = new Integer[5];
		System.out.print("Enter the Arras :");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Original array :");
		System.out.println(arr);
		Arrays.sort(arr);
	}

}
