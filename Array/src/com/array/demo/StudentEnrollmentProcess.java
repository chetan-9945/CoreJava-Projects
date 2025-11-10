package com.array.demo;

import java.util.Scanner;

public class StudentEnrollmentProcess 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Course []courses = new Course[3];
		
		courses[0] = new Course(1,"Java",35000d);
		courses[1] = new Course(2,".Net",30000d);
		courses[2] = new Course(3,"Python",32000d);
		
		Offer []offers = new Offer[2];
		
		offers[0] = new Offer("20% off on given course...");
		offers[1] = new Offer("Buy one get One free!");
		
		EducationInstitute es = new EducationInstitute(courses,offers);
		System.out.print("Enter the Student name :");
		String name = sc.nextLine();
		Student st = new Student(name,es);
		st.viewCoursesAndFees();
		st.viewOffers();
		System.out.print("Enter course ID to enroll:");
		int courseId = sc.nextInt();
		st.enrollInCourse(courseId);	
	}

}
