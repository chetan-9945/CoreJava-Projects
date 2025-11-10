package map.hashmap.TaskManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class TaskService 
{
	private LinkedList<Task> tasks;
	private HashMap<Integer,Task> taskMap;
	
	
	public LinkedList<Task> getTask()
	{
		return this.tasks;
	}
	
	public TaskService() 
	{
		super();
		tasks = new LinkedList<Task>();
		taskMap = new HashMap<Integer,Task>();
	}
	
	public void addTask(Task task)
	{

		if(!taskMap.containsKey(task.taskId()))
		{
			tasks.add(task);
			System.out.println("Task Added SuccesFully Into LinkedList...");
			taskMap.put(task.taskId(), task);
			System.out.println("Task Added SuccesFully Into HashMap...");
			System.out.println("------------------------------------------");
		}
		else
		{
			throw new IllegalArgumentException("taskId already exists");
		}
	}
	
	public Task findTaskById(int taskId)
	{
		return taskMap.get(taskId);
	}
	
	public boolean updateTaskStatus(int taskId,String newStatus)
	{
		if(taskMap.containsKey(taskId))
		{
		if(taskMap.get(taskId).status().equalsIgnoreCase(newStatus))	
		{
			System.out.println("Task is Already Same Previous Task...");
			return false;
		}
		}
		
		if(
				!newStatus.equalsIgnoreCase("Pending")   &&
				!newStatus.equalsIgnoreCase("In Progress") &&
				!newStatus.equalsIgnoreCase("Completed") 
				)
		{
			 throw new IllegalArgumentException("(Invalid status....\nAllowed values: \"Pending\", \"In Progress\", \"Completed\")");
		}
		
		Task present = taskMap.computeIfPresent(taskId, 
			(k,v)-> new Task(
			v.taskId(),
			v.taskName(),
			v.assignedTo(),
			newStatus,
			v.estimatedHours(),
			v.deadline()
		)
	);
		
	if(present!=null)
	{
		tasks.replaceAll(tasks -> tasks.taskId()==taskId ? present : tasks );
		return true;
	}

	return false;
	}
	
	public List<Task> getAllPendingTasks()
	{
		List<Task> pendingTask = new ArrayList<>();
		
		for(Task task : tasks)
		{
			if(task.status().equalsIgnoreCase("pending"))
			{
				pendingTask.add(task);
			}
		}
		return pendingTask;
	}
	
	public List<Task> sortTasksByDeadlineThenHours()
	{
//		List<Task> sortedList = new ArrayList<>();
		Collections.sort(tasks, 
				(t1,t2)-> 
		{
		int cmp =  t1.deadline().compareTo(t2.deadline());
			return (cmp!=0) ? cmp : Integer.compare(t1.estimatedHours(), t2.estimatedHours()); 
		});
		
		return tasks;
	}
}
