package com.ArrayList.scenario;

public class Book 
{
	private String title;
	private String author;
	private long isbn;
	private double price;
	private int quanity;
	
	public Book(String title, String author, long isbn, double price, int quanity) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
		this.quanity = quanity;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

//	public void setPrice(double price) {
//		this.price = price;
//	}

	public void setQuanity(int quanity) 
	{
		if(quanity <=0)
		{
			System.out.println("Quantity must be greater than zero...");
			System.exit(0);
		}
		this.quanity += quanity;
	}

	public long getIsbn() {
		return isbn;
	}

	public double getPrice() {
		return price;
	}

	public int getQuanity() {
		return quanity;
	}

	public String displayBook()
	{
		return "Book Details \t[ Title Of Book : "+this.title.toUpperCase()+",\tAuthor Of Book : "+this.author.toUpperCase()+",\tISBN No of Book : "+this.isbn+",\tPrice Of Book : "+this.price+",\tQuantity : "+this.quanity+"]";
				
	}
	
	
	
}
