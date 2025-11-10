package com.array.demo;

public record Student(String name,EducationInstitute institute) 
{
	public void viewCoursesAndFees()
	{
		for(Course course : institute.courses())
		{
			System.out.println(course);
		}
	}
	
	public void viewOffers()
	{
		for(Offer offers : institute.offers())
		{
		    System.out.println(offers);
		}
	}
	
	public void enrollInCourse(Integer courseId)
	{
		institute.enrollStudentInCourse(courseId, name);
	}
	
}
