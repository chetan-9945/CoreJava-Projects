package com.abstraction.blc;

public class DigitalProduct extends Product
{
	private String licensekey;

	public DigitalProduct(String name, double price, String category,String licensekey)
	{
		super(name, price, category);
		this.licensekey = licensekey;
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
		double tax = getPrice()*5/100;
		return tax;
	}

	@Override
	public String toString() {
		return " DigitalProduct \n"+ super.toString() + "\n licensekey=" + licensekey;
	}
	
	

}
