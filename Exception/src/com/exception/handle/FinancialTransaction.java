package com.exception.handle;

public class FinancialTransaction 
{
	public void processTransaction(double num1,long num2)
	{
		try
		{
			if(num1<0)
			{
				throw new IllegalArgumentException("transaction amount is negative or zero");
			}
			if(String.valueOf(num2).length() !=10)
			{
				throw new RuntimeException("Account no Must be 10 Digits only...");
			}
			System.out.println("Processing transaction...");
			System.out.println("Transaction successful: Amount Rs."+num1);
			System.out.println("transferred to account "+num2);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getLocalizedMessage());
		}
		catch(RuntimeException e)
		{
			System.out.println(e.getLocalizedMessage());
		}
	}
}
