package com.interaface_blc;

public class ShoppingCart 
{
	private double totalAmount;
	
	public ShoppingCart(double totalAmount)
	{
		this.totalAmount = totalAmount;
	}
	
	public void checkout(Payment payment)
	{
		if(payment instanceof CreditCardPayment)
		{
			payment.makePayment(totalAmount);
		}
		else if (payment instanceof DebitCardPayment)
		{
			payment.makePayment(totalAmount);
		}
		else if(payment instanceof UPIPayment)
		{
			payment.makePayment(totalAmount);
		}
	}
	
	public void cancelOrder(Payment payment)
	{
		if(payment instanceof CreditCardPayment)
		{
			payment.makeRefund(totalAmount);
		}
		else if (payment instanceof DebitCardPayment)
		{
			payment.makeRefund(totalAmount);
		}
		else if(payment instanceof UPIPayment)
		{
			payment.makeRefund(totalAmount);
		}
	}

}
