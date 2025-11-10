package com.logical;

import java.util.Arrays;

public class DuplicateEle {

	public static void main(String[] args) 
	{
		int arr [] = {2,2,4,5,4,6,2,4};
		int dupli [] = new int[10];
		System.out.println(Arrays.toString(arr));
		int c =0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i]=='*')
				continue;
			for(int j = i+1 ; j < arr.length; j++)
			{ 
				if(arr[i]==arr[j])
				{
					dupli[c]=arr[j];
					arr[j]= '*';
					c++;
				}
			}
		}
		
		for(int dp : dupli)
		{
			if(dp==0)
				continue;
			System.out.print(dp+" ");
		}
		System.out.println();
		for(int rm : arr)
		{
			if(rm=='*')
				continue;
			System.out.print(rm+" ");
		}
		
		
	}

}
