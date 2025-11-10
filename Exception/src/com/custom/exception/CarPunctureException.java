package com.custom.exception;

public class CarPunctureException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public CarPunctureException()
	{
		
	}
	
	public CarPunctureException(String errorMessage)
	{
		super(errorMessage);
	}
}
