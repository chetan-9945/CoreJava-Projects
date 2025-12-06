package com.logical;

import java.util.Arrays;

public class ZeroMoveAtLast 
{
	public static void main(String[] args) 
	{
		int [] arr = {0,1,3,0,10,0,12,0};
		zeroElementMove(arr);
	}
	
	public static void zeroElementMove(int []arr1)
	{
		int j = 0;
		int temp = 0;
		int []arr = arr1;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
			    temp = arr[j];
			    arr[j] = arr[i];
			    arr[i] = temp;
			    j++;   
			}
		}

		System.out.println(Arrays.toString(arr));
	}

}
