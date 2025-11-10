package com.abstraction.blc;

public abstract class Product
{
	private String name;
	private double price;
	private String category;
	
	public Product(String name, double price, String category) 
	{
		super();
		if(name.isBlank() && price < 0 && category.isBlank())
		{
			System.err.println("name & category can't null and price can't be negetive...");
			System.exit(0);
		}
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public abstract void applyDiscount(double percentage);
	public abstract double calculateTax();

	public String getName() {
		return name;
	}

	public void setName(String name) 
	{
		if(name.isBlank())
		{
			System.exit(0);
		}
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price)
	{
		if(price < 0)
		{
			System.exit(0);
		}
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) 
	{
		if(category.isBlank())
		{
			System.exit(0);
		}
		this.category = category;
	}

	@Override
	public String toString() {
		return "\nname=" + name + "\nprice=" + price + "\ncategory=" + category;
	}
	
	

}
