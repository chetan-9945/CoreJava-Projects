package com.interface_factory;

public class InterfaceImplementationByUsingAnonymous 
{

	public static void main(String[] args)
	{
		PrinterDemo pd = new PrinterDemo();
		
		Printer pt= pd.getPrinter();
		pt.print();
	}

}
