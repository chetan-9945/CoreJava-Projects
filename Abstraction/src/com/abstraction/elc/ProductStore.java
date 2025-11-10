package com.abstraction.elc;

import java.util.Scanner;

import com.abstraction.blc.*;


public class ProductStore 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Product Type:\r\n"
				+ "1. Digital Product\r\n"
				+ "2. Physical Product");
		System.out.print("Enter the choice :");
		int choice = Integer.parseInt(sc.nextLine());
		
		switch(choice)
		{
		case 1 :  
			System.out.println("Enter Digital Product Name :");
			String name = sc.nextLine();
			
			System.out.println("Enter Product Price :");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Product Category :");
			String Cat = sc.nextLine();
			
			System.out.println("Enter Product License Key :");
			String lKey = sc.nextLine();
			
			System.out.println("Enter the discount % on final bill");
			double dis = sc.nextDouble();
			Product pd = new DigitalProduct(name, price, Cat, lKey);
			System.out.println(pd);
			pd.applyDiscount(dis);
			System.out.println("Tax RS :"+pd.calculateTax());
			break;
			
		case 2:
			System.out.println("Enter Physical Product Name :");
			String name1 = sc.nextLine();
			
			System.out.println("Enter Product Price :");
			double price1 = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Product Category :");
			String Cat1 = sc.nextLine();
			
			System.out.println("Enter Product weight : ");
			double shippingWeight = sc.nextDouble();
			
			System.out.println("Enter the discount % on final bill");
			double dis1 = sc.nextDouble();
			Product dp = new PhysicalProduct(name1, price1, Cat1,shippingWeight);
			System.out.println(dp);
			dp.applyDiscount(dis1);
			System.out.println("Tax RS :"+dp.calculateTax());			
			break;
			
		case 3: 
			System.out.println("Wrong choice !!!");
			break;
			
			
		}
		
		
	

	}

}
