package com.array.demo;

public record Offer(String offerText) 
{

	@Override
	public String toString() {
		return offerText ;
	}

	
}
