package com.logical;

public class SecondElement 
{

	public static void main(String[] args) 
	{
		int arr[] = {20,45,85,21,65};  //20 21 45 65 85
		int second = arr[0];
		int high = arr[0];
		
		for(int i = 1; i< arr.length;i++)
		{
			if(arr[i]>high)
			{
				second = high;
				high = arr[i];
			}
			else if(arr[i]> second && arr[i]!=high)
			{
				second = arr[i];
			}
		}
		System.out.println("Second highest is :"+second);	
		
	}

}
