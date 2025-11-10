package com.logical;
//Write a java program to add the last and first element of a given array.
//
//Input as: [1,2,3,4,5,6]   
//Output as: 7

public class LastAndFirstElement 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,6,7,8,9};
		System.out.println("Addition of first and last index of java :"+(arr[0]+arr[arr.length-1]));
	}
}
