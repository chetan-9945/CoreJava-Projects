package com.abstraction.anonymousInnerclass;

public class PaymentGateway 
{
     public static Payment initiatePayment(Payment payment)
     {
    	 if(payment instanceof CreditCardPayment)
    	 {
    		 System.out.println("Initiating Credit Card payment.");
    		
    	 }
    	 else if(payment instanceof UPIPayment)
    	 {
    		 System.out.println("Initiating Credit Card payment.");
  
    	 }
    	 return payment;
     }

}
