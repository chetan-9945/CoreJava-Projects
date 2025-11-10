package map.hashmap.TaskManagementSystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public record Task(Integer taskId,String taskName,String assignedTo,String status,Integer estimatedHours,String deadline)
{
	private LocalDate localDate;


	public Task
	{
		if(	
			taskId<0 
		||  taskName.isBlank()
		||  assignedTo.isBlank()
		||  status.isBlank()
		||  estimatedHours <0	)
		{
			throw new IllegalArgumentException("Arguments Invalid...");
		}
		if( 
			!status.equalsIgnoreCase("Pending")   &&
			!status.equalsIgnoreCase("In Progress") &&
			!status.equalsIgnoreCase("Completed") 
				)
		{
			 throw new IllegalArgumentException("(Allowed values: \"Pending\", \"In Progress\", \"Completed\")");
		}
		
		try
		{
		  // LocalDate parsedDate = LocalDate.parse(deadline, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		LocalDate parsedDate = LocalDate.parse(deadline, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
			
			
		   
		if(parsedDate.isBefore(LocalDate.now()))
		{
			  throw new IllegalArgumentException("Deadline cannot be a past date.");
		}
		}
		catch(DateTimeParseException e)
		{
			 throw new IllegalArgumentException("Deadline must be in yyyy-MM-dd format.");
		}
		
	}
	
	
	@Override
	public String toString()
	{
		return String.format("|| %-15s | %-20s | %-15s | %-15s | %-15s | %-15s | ", 
				taskId,taskName,assignedTo,status,estimatedHours,deadline);
	}
	
}
