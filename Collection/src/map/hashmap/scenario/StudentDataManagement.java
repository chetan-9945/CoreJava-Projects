package map.hashmap.scenario;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class StudentDataManagement 
{
	@SuppressWarnings("null")
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		HashMap<String,Integer> student = new HashMap<>();
		
		while(true)
		{
		System.out.print("""
				------ Student Management Menu ------
1. Add Student
2. Update Marks
3. Delete Student
4. Search Student
5. Display All Students
6. Show Topper
7. Show Lowest Scorer
8. Show Total and Average Marks
9. Exit
Enter your choice: 
				
				""");
	int choice = 0;
		try
		{
			choice = Integer.parseInt(sc.nextLine());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Choice Number is Wrong Format");
			System.out.println("----------------------------------------------------------");
		}

		switch(choice)
		{
		case 1 :
			
			System.out.print("Enter the Student Name :");
			String name = sc.nextLine();
			System.out.print("Enter the student Marks :");
			
			int marks = -1;
			try
			{
				marks = Integer.parseInt(sc.nextLine());
			}
			catch(NumberFormatException e)
			{
				System.out.println("----------------------------------------------------------");
				System.out.println("Number is not a proper format...");
			}
			
			if(((name==null) && !(name.isBlank()) && !name.equalsIgnoreCase("null")) && (marks>=0 && marks<=100))
			{
			student.put(name, marks);
			System.out.println("Student added successfully!");
			System.out.println("----------------------------------------------------------");
			}
			else
			{
				System.out.println("Invalid Input Please check the input...");
				System.out.println("----------------------------------------------------------");
			}
			break;
			
		case 2 :
			System.out.println("Update Marks");
			System.out.print("Enter student name to update the marks : ");
			name = sc.nextLine();
			System.out.print("Enter new marks: ");
			marks = Integer.parseInt(sc.nextLine());
			if(!(name==null) || !(name.isBlank()) && (marks>=0 && marks<=100))
			{
			if(student.containsKey(name))
			{
				student.put(name, marks);
				System.out.println("Marks updated.");
				System.out.println("----------------------------------------------------------");
			}
			else
			{
				System.out.println("Entered name is not valid please Enter the correct name...");
				System.out.println("----------------------------------------------------------");
			}
			}
			else
			{
				System.out.println("Input is not valid...");
				System.out.println("----------------------------------------------------------");
			}
			break;
		
		case 3: 
			System.out.print("Enter student name to delete: ");
			name = sc.nextLine();
			if(student.containsKey(name))
			{
				student.remove(name);
				System.out.println("Student deleted.");
				System.out.println("----------------------------------------------------------");
			}
			else
			{
				System.out.println("Student not deleted.\nStudent Data not Found...");
				System.out.println("----------------------------------------------------------");
			}
			break;
			
		case 4: 
			System.out.print("Enter student name to search: ");
			name = sc.nextLine();
			if(student.containsKey(name))
			{
				System.out.println("Enter student name to search: "+student.get(name));
				System.out.println("----------------------------------------------------------");
			}
			else
			{
				System.out.println("Student is not existing....");
				System.out.println("----------------------------------------------------------");
			}
			break;
			
		case 5:
			if(!student.isEmpty())
			{
				System.out.println("---- Student Records ----");
				System.out.println("Name \t\t\t Marks");
				System.out.println("----------------------------------------------------------");
				student.forEach((k,v)->System.out.println(k+"  \t=>\t  "+v));
				System.out.println("----------------------------------------------------------");
			}
			else
			{
				System.out.println("Student Data is Not Available...");
				System.out.println("----------------------------------------------------------");
			}
			break;
			
		case 6:
			if(!student.isEmpty())
			{
			System.out.println("Topper is ");
			String topper = Collections.max(student.entrySet(), (s1,s2)-> s1.getValue().compareTo(s2.getValue())).getKey();
			System.out.println(topper+" : "+student.get(topper));
			System.out.println("----------------------------------------------------------");
			break;
			}
			else
			{
				System.out.println("Data is not Available...");
				System.out.println("----------------------------------------------------------");
			}
			break;
			
		case 7:
			if(!student.isEmpty())
			{
			System.out.println("Lowest Scorer ");
			String lowest = Collections.min(student.entrySet(), (s1,s2)-> s1.getValue().compareTo(s2.getValue())).getKey();
			System.out.println(lowest+" : "+student.get(lowest));
			System.out.println("----------------------------------------------------------");
			break;
			}
			else
			{
				System.out.println("Data is not Available...");
				System.out.println("----------------------------------------------------------");
			}
			break;
			
			
		case 8:
			if(!student.isEmpty())
			{
			Integer tmarks=0;
			for(Integer i:student.values())
			{
				tmarks+=i;
			}
			double avg=tmarks/student.size();
			System.out.println("Total Marks: "+tmarks);
			System.out.println("Average Marks: "+avg);
			System.out.println("----------------------------------------------------------");
			break;
			}
			else
			{
				System.out.println("Data is not Available...");
				System.out.println("----------------------------------------------------------");
			}break;
			
		case 9:
			System.out.println("Exiting... Thank you!");
			System.out.println("----------------------------------------------------------");
			System.out.println("----------------------------------------------------------");
			sc.close();
			System.exit(0);
			
		default : 
			System.out.println("Wrong Option...");
			
	}
}
}
}

