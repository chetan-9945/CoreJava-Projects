package com.array.demo;

public record EducationInstitute(Course[] courses,Offer[] offers)
{
	public void enrollStudentInCourse(int courseId,String studentName)
	{ boolean status= false;
		for(Course course : courses)
		{
			
			if(course.id() == courseId)
			{
				System.out.println(studentName+" enrolled in: "+course.name());
				status = true;
			}
		}
		if(status==false)
		{
			System.out.println("Course with ID "+courseId+" not found.");
		}
			
	}
}
