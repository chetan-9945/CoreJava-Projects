package map.hashmap.TaskManagementSystem;

import java.util.Scanner;

public class TaskManagementTester 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		TaskService ts = new TaskService();
		TaskUtility tu = new TaskUtility();
		while(true)
		{
			try
			{
		System.out.print(
				"""
				1. Add New Task :
				2. Print All Tasks :
				3. Update Any Task :
				4. Get All Pending Tasks :
				5. Sort Task By DeadLine & Estimated Hours :
				6. Exit : 
				Enter the choice ( 1 to 6 ) :
				"""
				);
		
		int choice = Integer.parseInt(sc.nextLine());
		
		switch(choice)
		{
		case 1 ->
		{
			tu.addTask(ts, sc);
		}
			
		case 2 ->
		{
			tu.printData(ts);
		}
			
		case 3 -> 
		{
			tu.update(ts, sc);
		}
				
		case 4 ->
		{
			tu.pendingTask(ts);
		}
		
		case 5 ->
		{
			tu.sortTask(ts);
		}
			
		case 6 ->
		{
			sc.close();
			System.out.println("Thank For Using...\nVisit again");
			System.out.println("------------------------------------------");
			System.exit(0);
		}
		}
			}
			catch(Exception e)
			{
				if(e instanceof NumberFormatException)
				{
					System.out.println("Number Not in Proper format...");
					System.out.println("------------------------------------------");

				}
				else
				{
					e.printStackTrace();
				//System.out.println();
				System.out.println("------------------------------------------");

				}
			}
	}
}

}
