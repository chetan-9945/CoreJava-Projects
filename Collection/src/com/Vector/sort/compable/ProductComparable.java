package com.Vector.sort.compable;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class ProductComparable 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> product = new ArrayList<>();
		
		product.add(new Product(111,"Laptop",14000d));
		product.add(new Product(333,"Mobile",17000d));
		product.add(new Product(444,"Camera",35000d));
		product.add(new Product(222,"TV",45000d));
		product.add(new Product(666,"Refregirator",13000d));
		product.add(new Product(555,"Washing Machine",65000d));
		
		Collections.sort(product);
		for(Product pd : product)
		{
		System.out.println(pd);
		}
		sc.close();
	}

}
