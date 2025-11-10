package map.hashmap.TaskManagementSystem;

import java.util.List;
import java.util.Scanner;

public class TaskUtility 
{
	private Integer taskId = null;
	private String taskName = null;
	private String assignedTo = null;
	private String status = null;
	private Integer estimatedHours = null;
	private String deadline = null;
	
	private void listPrint(List<Task> task)
	{
		if(task.isEmpty() || (task==null))
		{
			System.out.println("List is empty...");
			footer();
			return;
		}
		
		header();
		task.forEach(t1 -> System.out.println(t1));
		footer();
	}
	
	private void footer()
	{
		System.out.println("-------------------------------------------------------------------------");
	}
	
	private void header()
	{
		System.out.printf("|| %-15s | %-20s | %-15s | %-15s | %-15s | %-15s |\n",
		        "Task Id", "Task Name", "Assigned To", "Status", "Estimated Hours", "DeadLine");
		System.out.println("-------------------------------------------------------------------------");
	}
	
	public void addTask(TaskService ts,Scanner sc) throws RuntimeException
	{
		footer();
		System.out.print("Enter the Task id :");
		taskId = Integer.parseInt(sc.nextLine());
		System.out.print("Enter the Task Name :");
		taskName = sc.nextLine();
		System.out.print("Enter the Whome to Assigen a Task :");
		assignedTo = sc.nextLine();
		System.out.print("Enter the Status of Task :");
		status = sc.nextLine();
		System.out.print("Enter the Task Estimated Hours :");
		estimatedHours =Integer.parseInt(sc.nextLine()); 
		System.out.print("Enter the DeadLine of Task :");
		deadline = sc.nextLine();
		
		ts.addTask(new Task(taskId,taskName,assignedTo,status,estimatedHours,deadline));
	}
	
	public void printData(TaskService ts) throws RuntimeException
	{
		listPrint(ts.getTask());
	}
	
	public void update(TaskService ts,Scanner sc) throws RuntimeException
	{
		if(!ts.getTask().isEmpty())
		{
		System.out.print("Enter the Task Id :-");
		taskId = Integer.parseInt(sc.nextLine());
		System.out.print("Enter the Status :-");
		status = sc.nextLine();
		if(ts.updateTaskStatus(taskId, status))
		{
			System.out.println("New task Updated succesfully...");
			footer();

		}
		else
		{
			System.out.println("Task not Updated...");
			footer();
		}
		}
		else
		{
			System.out.println("List is empty...");
			footer();
		}
	}     
	
	public void pendingTask(TaskService ts) throws RuntimeException
	{
		listPrint(ts.getAllPendingTasks());
	}
	
	public void sortTask(TaskService ts) throws RuntimeException
	{

		listPrint(ts.sortTasksByDeadlineThenHours());
	}
	
}
