package com.ArrayList.scenario;

import java.util.Scanner;

public class BookLibrary {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Library lb = new Library();
		while(true)
		{
		System.out.println("1. Add Book\r\n"
				+ "2. Display Books\r\n"
				+ "3. Update Quantity\r\n"
				+ "4. Delete Book\r\n"
				+ "5. Exit");
		
		System.out.print("Enter the choice :");
		int choice = 0;
		try
		{
		choice = Integer.parseInt(sc.nextLine());
		}
		catch(Exception e)
		{
			System.out.println("Wrong input....");
			System.out.println("----------------------------------");
		}
		
		switch(choice)
		{
		
		case 1:  
			try
			{
			System.out.println();
			System.out.print("Enter Title: ");
			String title = sc.nextLine();
			System.out.print("Enter Author: ");
			String author = sc.nextLine();
			System.out.print("Enter ISBN: ");
			long isbn = Long.parseLong(sc.nextLine());
			System.out.print("Enter Price: ");
			double price = Double.parseDouble(sc.nextLine());
			System.out.print("Enter Quantity: ");
			int quantity = Integer.parseInt(sc.nextLine());
			System.out.println("----------------------------------");
			
			lb.addBook(new Book(title,author,isbn,price,quantity));
			break;
			}
			catch(RuntimeException e)
			{
				System.out.println(e.getMessage());
			}
			break;
			
		case 2:
			lb.displayAllBooks();
			break;
		
		case 3: 
			try
			{
			System.out.print("Enter the ISBN Number :");
			long searchIsbn = Integer.parseInt(sc.nextLine());
			lb.updateBookQuantityByISBN(searchIsbn);
			break;
			}
			catch(RuntimeException e)
			{
				System.out.println(e.getMessage());
			}
			
		case 4: 
			try
			{
			if(!lb.isEmpty())
			{
			System.out.print("Enter the Title of book :");
			String bookTitle = sc.nextLine();
			lb.deleteBookByTitle(bookTitle);
			}
			else
			{
				System.out.println("List is Empty...");
				System.out.println("------------------------------------------");
			}
			}
			catch (Exception e) {
			System.out.println(e.getMessage());
			}
			break;
			
		case 5:
			System.out.println("Exiting from the Application. Thank you!!!");
			sc.close();
			System.exit(0);
		}
		
	}
	}

}
