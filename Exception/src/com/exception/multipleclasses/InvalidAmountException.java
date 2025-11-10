package com.exception.multipleclasses;

public class InvalidAmountException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public InvalidAmountException()
	{
		
	}
	
	public InvalidAmountException(String errorMessage)
	{
		super(errorMessage);
	}

}