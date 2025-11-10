package com.interface_ecl;

import java.util.Scanner;

import com.interaface_blc.*;

public class Customer 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("WELCOME TO THE OUR APPLICATION...");
		
	
		while(true)
		{
			double totalPrice =0;
			
		System.out.print("Are you want to do Transaction [YES,NO]:");
			String trans = sc.nextLine();
			if(trans.equalsIgnoreCase("yes"))
			{
		System.out.print("Enter your total bill Amount :");
		  totalPrice = Double.parseDouble(sc.nextLine());
			}
			else if(trans.equalsIgnoreCase("no"))
			{
				System.out.println("Thank you !");
				System.exit(0);
			}
		
		
		System.out.println("\t\tChoose Payment Method:\r\n"
				+ "\t\t1. Credit Card\r\n"
				+ "\t\t2. Debit Card\r\n"
				+ "\t\t3. UPI\r\n"
				+ "\t\t4. Exit");
		
		System.out.print("\t\tEnter your choice : ");
		int choice = Integer.parseInt(sc.nextLine());
		Payment py =null;
		ShoppingCart sp = new ShoppingCart(totalPrice);

		switch(choice)
		{
		case 1: 
			System.out.print("Enter Account Holder name :");
			String name = sc.nextLine();
			py= new CreditCardPayment(name);
			
			System.out.print("Are you want continue or Cancel [yes,no] :");
			String confirm = sc.nextLine();
			
			if(confirm.equalsIgnoreCase("yes"))
			{
			System.out.println();
			sp.checkout(py);
			System.out.println("=================");
			}
			else if(confirm.equalsIgnoreCase("no"))
			{
			System.out.println();
			sp.cancelOrder(py);
			System.out.println("=================");
			}
			else 
			{
				System.out.println();
				System.out.println("Invalid Option !!!");
			}
			System.out.println();
			break;
			
		case 2: 
			System.out.println("Enter the Bank name :");
			String bankName = sc.nextLine();
			py = new DebitCardPayment(bankName);
			
			System.out.print("Are you want continue or Cancel [yes,no] :");
			confirm = sc.nextLine();
			if(confirm.equalsIgnoreCase("yes"))
			{
				System.out.println();
			sp.checkout(py);
			System.out.println("=================");
			}
			else if(confirm.equalsIgnoreCase("no"))
			{
				System.out.println();
			sp.cancelOrder(py);
			System.out.println("=================");
			}
			else 
			{
				System.out.println();
				System.out.println("Invalid Option !!!");
			}
			System.out.println();
			break;
			
		case 3:
			System.out.println("Enter the UPI id :");
			String upiId= sc.nextLine();
			py = new UPIPayment(upiId);
			
			System.out.print("Are you want continue or Cancel [yes,no] :");
			confirm = sc.nextLine();
			if(confirm.equalsIgnoreCase("yes"))
			{
				System.out.println();
			sp.checkout(py);
			System.out.println("=================");
			}
			else if(confirm.equalsIgnoreCase("no"))
			{
				System.out.println();
			sp.cancelOrder(py);
			System.out.println("=================");
			}
			else 
			{
				System.out.println();
				System.out.println("Invalid Option !!!");
			}
			System.out.println();
			break;
			
		case 4 :
			System.out.println("Thank You for visiting!!!");
			System.exit(0);

		}

	}
	}

}
