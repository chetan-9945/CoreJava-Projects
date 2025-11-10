package map.hashmap.courseRegistration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CourseRegistration 
{

	public static void main(String[] args) 
	{
		HashMap<String,List<String>> course = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			try
			{
		System.out.print(
				"""
				--- Course Registration Menu ---
				1. Register student to course
				2. Remove student from course 
				3. View course-wise student list
				4. Exit
				Enter your choice:
				"""
				);
		
		int choice = Integer.parseInt(sc.nextLine());
		
		switch(choice)
		{
		case 1 ->
		{
			System.out.print("Enter the course name :");
			String courseName = sc.nextLine();
			System.out.print("Enter student name:");
			String name = sc.nextLine();
			course.computeIfAbsent(courseName.toUpperCase(), key -> new ArrayList<String>()).add(name.toUpperCase());
		}
		
		case 3 ->
		{
			 System.out.println("Course → Students List:");
			 course.forEach((k,v)->System.out.println(k+" -> "+v));
		}
		
		case 2 ->
		{
			System.out.print("Enter course name: ");
			String courseName = sc.nextLine();
			System.out.print("Enter student name to remove: ");
			String name = sc.nextLine();
			List<String> computeIfPresent = course.computeIfPresent(courseName.toUpperCase(), (k,v) -> 
			{
				if(v.contains(name.toUpperCase()))
					v.remove(name.toUpperCase());
				return v;
			});
			
			System.out.println(computeIfPresent);
		}
		
		case 4->
		{
			System.out.println("Thank u For Using...");
			sc.close();
			return;
		}
		}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
	}
	}
}
