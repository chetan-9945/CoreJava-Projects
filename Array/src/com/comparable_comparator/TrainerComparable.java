package com.comparable_comparator;

import java.util.Scanner;


import java.util.Arrays;

public class TrainerComparable 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size for array :");
		int size = Integer.parseInt(sc.nextLine());
		
		Trainer[] td = new Trainer[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter the id :");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.print("Enter the Name :");
			String name = sc.nextLine();
			
			System.out.print("Enter the salary :");
			double salary = Double.parseDouble(sc.nextLine());
			
			System.out.print("Enter the Experience :");
			double experience = Double.parseDouble(sc.nextLine());
			
			td[i] = new Trainer(id,name,salary,experience);
		}
		
		Arrays.sort(td);
		
		for(Trainer ts : td )
		{
			System.out.println(ts);
			
		}

	}

}
