package com.custom.exception;

public class InvalidAgeException extends RuntimeException
{
	
	private static final long serialVersionUID = 1L;


	public InvalidAgeException(String errorMessgae) 
	{
		super(errorMessgae);
	}
	
	public InvalidAgeException() 
	{
		super();
	}
	
}
