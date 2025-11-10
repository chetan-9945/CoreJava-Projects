package com.equal_hashcode;

import java.util.Scanner;

public class ProductEquality {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the product id :");
		int productId = Integer.parseInt(sc.nextLine());
		System.out.print("Enter the product name :");
		String name = sc.nextLine();
		
		Product p1 = new Product(productId,name);
		
		System.out.print("Enter the product id :");
		int productId1 = Integer.parseInt(sc.nextLine());
		System.out.print("Enter the product name :");
		String name1 = sc.nextLine();
		
		Product p2 = new Product(productId1,name1);
		Employee e1 = new Employee(productId1,name1);
		
		System.out.println("Equal Method is :"+p1.equals(e1));
		System.out.println(p1.hashCode()+" : "+e1.hashCode());
		
	}

}
