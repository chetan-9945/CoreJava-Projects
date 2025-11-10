package com.custom.exception;

public class InvalidNameException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public InvalidNameException(String errorMessgae) 
	{
		super(errorMessgae);
	}
	
	public InvalidNameException() 
	{
		super();
	}
	

}
