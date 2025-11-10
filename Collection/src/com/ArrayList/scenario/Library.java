package com.ArrayList.scenario;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Library 
{
	private ArrayList<Book> books;

	
	public Library() {
		super();
		this.books = new ArrayList<Book>();
	}
	
	public boolean isEmpty()
	{
		return books.isEmpty();
	}
	
	public void addBook(Book book)
	{
		if(this.searchBookByISBN(book.getIsbn())!=null)
		{
			System.out.println("Book is already Available...");
			System.out.println("----------------------------------");
		}
		else
		{
			books.add(book);
			System.out.println("Book added successfully.");
			System.out.println("----------------------------------");
		}
		
	}
	
	private Book searchBookByISBN(long isbn)
	{
		for(Book book : books)
		{
			if(isbn==book.getIsbn())
			{
				return book;
			}
		}
		return null;
	}
	
	public void displayAllBooks()
	{
		if(books.isEmpty())
		{
			System.out.println("Books is not Available in Library...");
			System.out.println("----------------------------------");
		}
		for(Book book : books)
		{
			System.out.println(book.displayBook());
		}
	}
	
	public void updateBookQuantityByISBN(long isbn) throws RuntimeException
	{ 
		Scanner sc = new Scanner(System.in);
		int quantity =0;
		Book book = this.searchBookByISBN(isbn);
		if(book!=null)
		{
			System.out.print("Enter the Quantity for increment :");
			quantity = Integer.parseInt(sc.nextLine());
			book.setQuanity(quantity);
			System.out.println("Quantity updated successfully.");
			System.out.println("new Quantity: "+book.getQuanity());
			System.out.println("----------------------------------");
		}
		else
		{
			System.out.println("Book is not Available with "+isbn+" number");
			System.out.println("----------------------------------");
		}
		
	}
	
	public void deleteBookByTitle(String title)
	{
		if(title.isBlank())
		{
			System.out.println("Title can't Blank or empty...");
			System.out.println("----------------------------------");
			System.exit(0);
		}
		
		Iterator<Book> itr = books.iterator();
		
		while(itr.hasNext())
		{
			if(itr.next().getTitle().equalsIgnoreCase(title))
			{
				itr.remove();
				System.out.println(title+" book has removed successfully...");
				System.out.println("----------------------------------");
			}
			else
			{
				System.out.println(title+" Not Found...");
				System.out.println("----------------------------------");
			}
		}
	}
}
