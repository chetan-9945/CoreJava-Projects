package com.abstraction.anonymousInnerclass;

sealed interface Payment permits CreditCardPayment,UPIPayment
{
	void processPayment();
	void applyDiscount();

}
