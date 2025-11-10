package com.interface_factory;

public class PrinterDemo 
{
	public Printer getPrinter()
	{
		return new Printer()
		{

			@Override
			public void print() 
			{
				System.out.println("Printing.....");
			}
			
		};

	
	}

}
