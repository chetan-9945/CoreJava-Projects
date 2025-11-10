package com.custom.exception;

//public class Student
//{
//	
//	private String studentName;
//	private int age;
//	private int marks;
//	
//	public Student(String studentName,int age,int marks)
//	{
//		if(studentName == null ||studentName.trim().isBlank())
//		{
//			throw new InvalidNameException("Name Should Not Null or Empty");
//		}
//		if(age<17 || age>31)
//		{
//			throw new InvalidAgeException("Age Must be Only in between 18 & 30.");
//		}
//		if(marks<0 || marks>100)
//		{
//			throw new InvalidMarksException("Marks Must be in between 0 to 100 only...");
//		}
//		this.studentName=studentName;
//		this.marks= marks;
//		this.age=age;
//	}
//
//	public String getStudentName()
//	{
//		return studentName;
//	}
//
//	public int getAge() 
//	{
//		return age;
//	}
//
//	public int getMarks() 
//	{
//		return marks;
//	}
//}

public record Student(String studentName,int age,int marks) 
{
	public void student()  throws ClassNotFoundException
	{
		if(studentName == null ||studentName.trim() .isBlank()) 
			{
				throw new ClassNotFoundException("Name Should Not Null or Empty");
			}
			if(age<17 || age>31)
			{
				throw new InvalidAgeException("Age Must be Only in between 18 & 30.");
			}
			if(marks<0 || marks>100)
			{
				throw new InvalidMarksException("Marks Must be in between 0 to 100 only...");
			}
	}

	@Override
	public String toString() {
		return "\tStudent \nstudentName :" + studentName + "\nage :" + age + "\nmarks :" + marks;
	}
	
}