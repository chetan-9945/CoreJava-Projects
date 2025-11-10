package com.Vector.Scenario;

import java.util.Scanner;
import java.util.Vector;

public class Library 
{
	public void displayAvailableBooks(Vector<Book> book)
	{
		System.out.println("Available Books in the Library :");
		book.forEach(book1-> System.out.println(book1));
		System.out.println("--------------------------");
	}
	
	
	public void issueBook(Vector<Book> book,Scanner sc)
	{
		System.out.println("Issuing a Book");
		System.out.print("Enter the book id:-");
		int id = Integer.parseInt(sc.nextLine());
		boolean flag = false;
		for(Book books : book)
		{
			if(books.id() == id)
			{
				System.out.println("Book is Found :\n"+books);
				System.out.println("--------------------------");
				book.remove(books);
				flag=true;
				break;
			}
		}
		
		if(!flag)
		{
			System.out.println(id+" Book Not Found....");
			System.out.println("--------------------------");
		}
	}
	
	public void searchBook(Vector<Book> book, Scanner sc)
	{
		System.out.println("Search a Book...");
		System.out.println("--------------------------");
		System.out.print("Enter the Title or Author Name To search a Book :");
		
		String searchBook = sc.nextLine();
		boolean flag = false;
		
		for(Book books : book)
		{
			if(books.author().equalsIgnoreCase(searchBook) || books.title().equalsIgnoreCase(searchBook))
			{
				System.out.println("Book is Found :"+books);
				System.out.println("--------------------------");
				flag=true;
			}
		}
		
		if(!flag)
		{
			System.out.println(searchBook+" No matching books found.");
			System.out.println("--------------------------");
		}
	}
	
}
