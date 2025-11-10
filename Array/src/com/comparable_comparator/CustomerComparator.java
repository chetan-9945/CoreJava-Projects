package com.comparable_comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class CustomerComparator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size for array :");
		int size = Integer.parseInt(sc.nextLine());
		
		Customer []cust = new Customer[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter the id :");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.print("Enter the Name :");
			String name = sc.nextLine();
			
			System.out.print("Enter the Bill :");
			double bill = Double.parseDouble(sc.nextLine());
		
			cust[i] = new Customer(id,name,bill);
		}
		sc.close();
		
		System.out.println("-------------------------------------------------");
		//Comparator<Customer> lambda = (cust1,cust2) -> Integer.compare(cust1.id(),cust2.id());
		Comparator<Customer> lambda = (cust1,cust2) -> cust1.id()-cust2.id();
		Arrays.sort(cust,lambda);
		
		for(Customer custs : cust)
		{
			System.out.println(custs);
		}
		
		System.out.println("-------------------------------------------------");
		Arrays.sort(cust,(cust1,cust2)-> cust1.name().compareTo(cust2.name()));
	
		
		for(Customer custs : cust)
		{
			System.out.println(custs);
		}
		
		System.out.println("-------------------------------------------------");
		//Arrays.sort(cust,(cust1,cust2)-> Double.compare(cust1.bill(), cust2.bill()));
		Arrays.sort(cust,(cust1,cust2)-> (int)(cust1.bill()-cust2.bill()));
		for(Customer custs : cust)
		{
			System.out.println(custs);
		}
		
	}

}
