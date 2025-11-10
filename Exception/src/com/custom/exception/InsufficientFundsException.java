package com.custom.exception;

public class InsufficientFundsException extends Exception 
{
	private static final long serialVersionUID = 1L;
	
	public InsufficientFundsException()
	{
		
	}
	
	public InsufficientFundsException(String errorMessage)
	{
		super(errorMessage);
	}
}
