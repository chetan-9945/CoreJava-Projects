package com.logical;

import java.util.Scanner;

//Search for a given Element in an Array if present then print
//"Element found at index : ", if not present print "Element not found"
//    
//Input as: 1 4 3 5 2 6 5
//Enter searching element: 5
//Output: Element found at index 3
//
//Input as: 1 4 3 5 2 6
//Enter searching element: 7
//Output: Element not found


public class ElementFoundOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,5,2,6,5};
		System.out.print("Enter the Searching the elements :");
		int serachElement = Integer.parseInt(sc.nextLine());
		int index =0;
		boolean status = false;
		for(int arrs : arr)
		{
			if(arrs==serachElement)
			{
				System.out.println("Element found at index :"+index);
				status = true;
			}
			index++;
		}
		if(!status)
		{
			System.out.println("Elements are not found....");
		}
		
		
	}

}
