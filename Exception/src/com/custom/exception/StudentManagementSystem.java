package com.custom.exception;

import java.util.Scanner;

public class StudentManagementSystem
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the No of Students :");
		int noOfStudents = Integer.parseInt(sc.nextLine());
		
		
		try(sc)
		{
			while(noOfStudents!=0)
			{
			System.out.print("Enter the Student Name :");
			String name = sc.nextLine();
			System.out.print("Enter the Student Age :");
			int age = Integer.parseInt(sc.nextLine());
			System.out.print("Enter the Student Marks :");
			int marks = Integer.parseInt(sc.nextLine());
			
			Student sd = new Student(name,age,marks);
			
//			System.out.println("------------------------------------");
//			System.out.println("Student Name is :"+sd.studentName());
//			System.out.println("Student age is :"+sd.age());
//			System.out.println("Student Marks is :"+sd.marks());
//			System.out.println("------------------------------------");
			System.out.println("------------------------------------");
			sd.student();
			System.out.println(sd);
			System.out.println("------------------------------------");
			
			noOfStudents--;
		   
		}
		}
		catch( ClassNotFoundException |IllegalStateException |NumberFormatException |InvalidAgeException | InvalidMarksException | InvalidNameException e)
		{
			if(e instanceof NumberFormatException)
			{
				System.out.println("Number is Not in proper Format...");
			}
			else
			{
			System.out.println(e.getMessage());
			}
		}
		System.out.println("Thanks for Using...");
		}
	}

