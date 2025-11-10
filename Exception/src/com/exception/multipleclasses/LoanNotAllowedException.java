package com.exception.multipleclasses;

public class LoanNotAllowedException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public LoanNotAllowedException()
	{
		
	}
	
	public LoanNotAllowedException(String errorMessage)
	{
		super(errorMessage);
	}

}