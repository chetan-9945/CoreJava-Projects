package com.comparable_comparator;

public record Customer(int id,String name,double bill) 
{

	@Override
	public String toString()
	{
		return id + " : " + name + " : " + bill;
	}
		
}
