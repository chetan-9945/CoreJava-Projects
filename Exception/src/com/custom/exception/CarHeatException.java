package com.custom.exception;

public class CarHeatException extends Exception
{
	private static final long serialVersionUID = 1L;

	public CarHeatException()
	{
		
	}
	
	public CarHeatException(String errorMessage)
	{
		super(errorMessage);
	}
}
