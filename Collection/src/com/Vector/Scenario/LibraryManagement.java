package com.Vector.Scenario;

import java.util.Scanner;
import java.util.Vector;

public class LibraryManagement {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Vector<Book> book = new Vector<>();
		Library lib = new Library();
		System.out.print("Enter the no of Books: ");
		int size = Integer.parseInt(sc.nextLine());
		
		for(int i=0 ; i<size;i++)
		{
			
			System.out.print("Enter the book id :-");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.print("Enter the book title:-");
			String title= sc.nextLine();
			
			System.out.print("Enter the book Author:-");
			String author = sc.nextLine();
			System.out.println("--------------------------");
			
			book.add(new Book(id,title,author));	
		}
		
		while(true)
		{
			
			System.out.println( "1) Display Books Available in the Library :\n"+
				    " 2) Search a Book in the Library :\n"+
					 "3) Issue a Book from the Library :\n"+
					 "4) Exit from the application :\n");
			
			System.out.print("Please Enter your Choice :");
			int choice = Integer.parseInt(sc.nextLine());
			System.out.println("--------------------------");
			
			switch(choice)
			{
			case 1 : lib.displayAvailableBooks(book);
			break;
			
			case 2: lib.searchBook(book, sc);
			break;
			
			case 3: lib.issueBook(book, sc);
			break;
			
			case 4: 
				System.out.println("------------------------------------");
				System.out.println("Thank you for visiting Out Library.");
				System.exit(0);
			}
		}
	}

}
