package com.abstraction.anonymousInnerclass;

import java.util.Scanner;

public class PaymentGatewayUsingInterface 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select your payment Option :\r\n"
				+ "	\t\t 1) Credit Card \r\n"
				+ "	\t\t 2) UPI ");
		System.out.println("Please Enter your Choice :");
		int choice = Integer.parseInt(sc.nextLine());
		Payment py = null;
		switch(choice)
		{
		case 1: 
			 py = PaymentGateway.initiatePayment(new CreditCardPayment());
			 py.applyDiscount();
    		 py.processPayment();
			break;
		case 2:
			 py = PaymentGateway.initiatePayment(new UPIPayment());
			 py.applyDiscount();
    		 py.processPayment();
			break;
		case 3:
			System.out.println("Wrong Choice...");
			break;
		}

	}

}
