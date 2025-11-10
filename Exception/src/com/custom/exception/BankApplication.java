package com.custom.exception;

import java.util.Scanner;

public class BankApplication 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int size=0;
		char ch=0;
		System.out.print("Enter the No of bank customer details :");
		try
		{
		size= Integer.parseInt(sc.nextLine());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Size must be positive Numeric Value only...");
			System.exit(0);
		}
		
	   if(size < 1)
	   {
		   try
		   {
			   throw new IllegalArgumentException("Size Must be Positive or Non zero...");
		   }
		   catch(IllegalArgumentException e)
		   {
			   System.out.println(e.getMessage());
		   }
	   }
	   else
	   {
		BankAccount []obj = new BankAccount[size];
		// BankAccount bank = new BankAccount(accNo, accHolder, balance);
		try
		{
		for(int i=0; i<obj.length;i++)
		{
			System.out.println("-------------------------------");
			System.out.print("Enter the Account Number :");
			String accNo = sc.nextLine();
			System.out.print("Enter the Account Holder Name :");
			String accHolder = sc.nextLine();
			System.out.print("Enter the Balance :");
			double balance = Double.parseDouble(sc.nextLine());
	
			obj[i]= new BankAccount(accNo, accHolder, balance);
			
		}
		}
		catch( InvalidNameException e )
		{
			System.out.println(e.getMessage());
			System.exit(0);
		}
		catch(RuntimeException e)
		{
			if(e instanceof NumberFormatException)
			{
			System.out.println("Account Number Should be in proper format...");
			}
			else
			{
				System.out.println(e.getMessage());
			}
			System.exit(0);
		}
		if(obj.length != 0)
		{
		System.out.println("-------------------------------");
		System.out.println("\nAccount Details Before Transaction:");
		for(BankAccount object : obj)
		{
			
			System.out.println(object);
			
		}
		System.out.println("-------------------------------");
		System.out.print("Are you want to transfer money?");
		ch = sc.next().charAt(0);
		sc.nextLine();
		}
		else
		{
			throw new NegativeArraySizeException("Your array Index is Negetive or zero...");
		}
		try 
		{
		if(ch == 'Y' || ch == 'y')
		{
		TransactionService ts = new TransactionService();
		System.out.print("Enter the from Account :");
		int from = Integer.parseInt(sc.nextLine());
		System.out.print("Enter the to Account :");
		int to = Integer.parseInt(sc.nextLine());
		if(from < obj.length && to < obj.length)
		{
		System.out.println("Enter the Amount :");
		double transferAmount = Double.parseDouble(sc.nextLine());
	
		ts.transferFunds(obj[from], obj[to],transferAmount);
		System.out.println("-------------------------------");
		System.out.println("\nAccount Details Before Transaction:");
		for(BankAccount object : obj)
		{
			
			System.out.println(object);
			
		}
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException("Input out of the Index...");
		}
		}
		else if(ch == 'N' || ch == 'n')
		{
			System.out.println("Thanks for using our Banking Serives...");
		}
		else 
		{
			throw new IllegalArgumentException("Your choice is Wrong...");
		}
		}
		catch(Exception e)
		{
			if(e instanceof InsufficientFundsException)
			{
				System.out.println(e.getMessage());
			}
			else if(e instanceof IllegalArgumentException)
			{
				System.out.println(e.getMessage());
			}
			else if(e instanceof ArrayIndexOutOfBoundsException)
			{
				System.out.println(e.getMessage());
			}
		}
		
	}
	}
}
