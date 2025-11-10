package com.abstraction.blc;

public class PhysicalProduct extends Product
{
	private double shippingWeight;

	public PhysicalProduct(String name, double price, String category,double shippingWeight) 
	{
		super(name, price, category);
		if(shippingWeight < 0)
		{
			System.out.println("Weight cannot be negetive...");
		}
		this.shippingWeight = shippingWeight;
	}

	@Override
	public void applyDiscount(double percentage) 
	{
		if(percentage < 0)
		{
			System.err.println(" -ve not allowed ");
			System.exit(0);
		}
		System.out.println("Discount applied :"+(getPrice()*percentage)/100);
		setPrice(getPrice()-(getPrice()*percentage/100));
		System.out.println("New Price :"+getPrice());
	}

	@Override
	public double calculateTax() 
	{
		double tax = getPrice()*0.08;
		return tax;
	}
	
	public double calculateShippingCost()
	{
		return shippingWeight*5;
	}

	@Override
	public String toString() 
	{
		return "PhysicalProduct \n"+super.toString()+"\n shipping Weight=" + shippingWeight;
	}
	
}
