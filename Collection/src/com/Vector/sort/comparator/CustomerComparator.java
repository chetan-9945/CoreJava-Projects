package com.Vector.sort.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CustomerComparator 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Customer> customer = new ArrayList<>();
		
		customer.add(new Customer(222,"chetan",45000d));
		customer.add(new Customer(444,"Manisha",65000d));
		customer.add(new Customer(555,"Aditya",12000d));
		customer.add(new Customer(333,"Sakshi",35000d));
		customer.add(new Customer(111,"Akanksha",36000d));
		customer.add(new Customer(666,"Ravi",46000d));
		
		System.out.println("-----------------------------------");
		System.out.println("Original Before soring the ArrayList");
		customer.forEach(System.out::println);
		System.out.println("-----------------------------------");
		System.out.println("a) Based on customer number");
		Collections.sort(customer, (c1,c2)-> c1.getCustomerNumber().compareTo(c2.getCustomerNumber()));
		customer.forEach(cust -> System.out.println(cust));
		System.out.println("-----------------------------------");
		System.out.println("b) Based on customer name");
		Collections.sort(customer, (c1,c2)->c1.getCustomerName().compareToIgnoreCase(c2.getCustomerName()));
		customer.forEach(cust -> System.out.println(cust));
		System.out.println("-----------------------------------");
		System.out.println("c) Based on customer bill");
		Collections.sort(customer, (c1,c2)->c1.getCustomerBill().compareTo(c2.getCustomerBill()));
		customer.forEach(cust -> System.out.println(cust));
		
		sc.close();
		
	}

}
