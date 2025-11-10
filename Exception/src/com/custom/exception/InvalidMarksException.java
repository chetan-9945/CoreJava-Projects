package com.custom.exception;

public class InvalidMarksException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public InvalidMarksException(String errorMessgae) 
	{
		super(errorMessgae);
	}
	
	public InvalidMarksException() 
	{
		super();
	}
}
