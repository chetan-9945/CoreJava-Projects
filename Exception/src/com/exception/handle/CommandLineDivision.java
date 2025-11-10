package com.exception.handle;

public class CommandLineDivision 
{

	public static void main(String[] args) 
	{
		String divident = args[0];
		String divisor = args[1];
		
		exception(divident, divisor);
	}
	
	public static void exception(String divident,String divisor)
	{
		try
		{
			int divident1 = Integer.parseInt(divisor);
			int divisor1 = Integer.parseInt(divisor);
			try
			{
				System.out.println("Division result: "+divident1/divisor1);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e.toString());	
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
			//System.out.println(e.getMessage());
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.toString());
			//System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Division operation completed.");
		}
	}
}
