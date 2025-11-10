package com.logical;
//Find Minimum Element in an Array.
//Input as: 6 3 2 1 5 5 4
//Output as: Min is: 1

public class FindMinElements {

	public static void main(String[] args) 
	{
		int arr[] = { 6,3,2,1,5,5,4,44};
		int min = arr[0];
		int max = arr[0];
		for(int i= 0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(min>arr[j])
				{
					min=arr[j];
				}
				if(max<arr[j])
				{
					max=arr[j];
				}
			}
		}
		System.out.println("Minimum element is :"+min);
		System.out.println("Maximum element is :"+max);
	}
}
