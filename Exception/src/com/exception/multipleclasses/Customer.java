package com.exception.multipleclasses;

import com.custom.exception.InvalidNameException;

public class Customer 
{
	private String name;
	private BankAccount account;
	
	public Customer()
	{
	}
	
	public Customer(String name,BankAccount account)
	{
		if(name.trim().isBlank())
		{
			throw new InvalidNameException("Name can't be Empty...");
		}
	  this.name = name;
	  this.account=account;
	}

	public String getName()
	{
		return name;
	}
	
	public BankAccount getAccount()
	{
		return account;
	}
}
