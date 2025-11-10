package com.interaface_blc;

public non-sealed class UPIPayment implements Payment 
{
	private String upiId;
	
	public UPIPayment(String upiId)
	{
		this.upiId = upiId;
	}

	@Override
	public void makePayment(double amount)
	{
		System.out.println("Starting checkout for amount RS :"+amount+"\r\n"
				+ "Paid RS "+amount+" using UPI ID :"+upiId);
	}

	@Override
	public void makeRefund(double amount) 
	{
		System.out.println("Order Canceled. Initiating Refund...\r\n"
				+ "Cancelling order for amount RS :"+amount+"\r\n"
				+ "Refunded RS "+amount+" to UPI ID : "+upiId);
	}

}
