package com.interaface_blc;

public sealed interface Payment permits CreditCardPayment, DebitCardPayment, UPIPayment 
{
	void makePayment(double amount);
	void makeRefund(double amount);
}

