package com.exception.handle;

import java.util.Scanner;

public class FinancialMain {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		FinancialTransaction ft = new FinancialTransaction();
		
		try
		{
			System.out.print("Enter transaction amount: ");
			String amt= sc.nextLine();
			System.out.print("Enter 10-digit account number: ");
			String bankAcc = sc.nextLine();
			
			double amount = Double.parseDouble(amt);
			long bankAccount = Long.parseLong(bankAcc);
			ft.processTransaction(amount, bankAccount);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid input. Please enter numeric values only.");
		}
		finally
		{
			sc.close();
		}
	}

}
