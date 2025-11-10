package com.interaface_blc;

public non-sealed class DebitCardPayment implements Payment 
{
	private String bankName;
	
	public DebitCardPayment(String bankName)
	{
		this.bankName = bankName;
	}
	

	@Override
	public void makePayment(double amount) 
	{
		System.out.println("Starting checkout for amount RS :"+amount+"\r\n"
				+ "Paid RS :"+amount+" using Debit Card Bank:"+bankName);

	}

	@Override
	public void makeRefund(double amount) 
	{
		System.out.println("Order Canceled. Initiating Refund...");
		System.out.println("Cancelling order for amount RS :"+amount+"\r\n"
				+ "Refunded RS :"+amount+" to Debit Card Bank:"+bankName);
	}

}
