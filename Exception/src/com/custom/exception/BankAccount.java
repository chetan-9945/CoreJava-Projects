package com.custom.exception;

public class BankAccount
{
	private String accountNumber;
	private String accountHolder;
	private double balance;
	
	public BankAccount(String accountNumber, String accountHolder, double balance)
	{
		if(accountHolder == null | accountHolder.trim().isBlank())
		{
			throw new InvalidNameException("Account Number is Invalid...");
		}
		int accno = Integer.parseInt(accountNumber);
		if(accountNumber == null | accountNumber.trim().isBlank()  )
		{
			throw new InvalidNameException("Invalid Name...");
		}
		if(balance < 0)
		{
			throw new IllegalArgumentException("Negeative Balance not allowed....");
		}
		
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}

	public String getAccountNumber() 
	{
		return accountNumber;
	}

	public String getAccountHolder() 
	{
		return accountHolder;
	}

	public double getBalance() 
	{
		return balance;
	}
	
	public void debit(double amount)
	{
		System.out.println("-------------------------------");
		System.out.println("Before Debited Amount :"+balance);
		if(balance > amount)
		{
		balance -= amount;
		System.out.println("After Debited Amount :"+balance);
		}
		else
		{
			throw new IllegalArgumentException("Debit Amount should be less than Balance...");
		}
		System.out.println("Debited Amount is :"+amount);
	}
	
	public void credit(double amount)
	{
		System.out.println("-------------------------------");
		System.out.println("Before Credited Amount :"+balance);
		if(amount > 0 )
		{
		balance += amount;
		System.out.println("After Credited Amount :"+balance);
		}
		else
		{
			throw new IllegalArgumentException("Debit Amount should be less than Balance...");
		}
		System.out.println("Credited Amount is :"+amount);
	}

	 @Override
	    public String toString()
	    {
	        return "Account No: " + accountNumber + " | Holder: " + accountHolder + " | Balance: " + balance;
	    }
}
