package com.ArrayList.OnlineCabBook;

public record Customer(int custId,String customerName,String pickupLocation,String dropLocation,int distance,String phone) 
{
	public Customer
	{
		if(custId<=0)
		{
			throw new IllegalArgumentException("Cust id are Invalid...");
		}
		else if(customerName.isBlank())
		{
			throw new IllegalArgumentException("Name are Invalid...");
		}
		
		else if(pickupLocation.isBlank())
		{
			throw new IllegalArgumentException("location are Invalid...");
		}
		else if(dropLocation.isBlank())
		{
			throw new IllegalArgumentException("location are Invalid...");
		}
		else if(distance <=0)
		{
			throw new IllegalArgumentException("distance are Invalid...");
		}
		else if(phone.length()!=10)
		{
			throw new IllegalArgumentException("phone are Invalid...");
		}
	
	}
}
