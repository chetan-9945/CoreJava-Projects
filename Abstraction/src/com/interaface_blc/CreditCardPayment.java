package com.interaface_blc;

public non-sealed class CreditCardPayment implements Payment
{

	private String cardHolderName;
	
	public CreditCardPayment(String cardHolderName)
	{
		this.cardHolderName = cardHolderName;
	}
	
	
	@Override
	public void makePayment(double amount) 
	{
		System.out.println("Starting checkout for amount RS :"+amount);
		System.out.println("Paid RS :"+amount+" using Credit Card Holder :"+cardHolderName);
	}

	@Override
	public void makeRefund(double amount)
	{
		System.out.println("Order Canceled. Initiating Refund...");
		System.out.println("Cancelling order for amount RS :"+amount+"\r\n"
				+ "Refunded RS :"+amount+" to Credit Card Holder :"+cardHolderName);
	}

}
