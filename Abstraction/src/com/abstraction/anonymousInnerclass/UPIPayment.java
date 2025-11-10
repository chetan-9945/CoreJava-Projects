package com.abstraction.anonymousInnerclass;

non-sealed class UPIPayment implements Payment
{

	@Override
	public void processPayment() 
	{
		System.out.println("Processing UPI payment...");
	}

	@Override
	public void applyDiscount() 
	{
		System.out.println("Applying ₹100 cashback for UPI users.");
	}

}
