package com.lambda;

public class Employee 
{
	private int id;
	private String name;
	private String designation;
	private double salary;
	
	public Employee(int id, String name, String designation, double salary) 
	{
		super();
		if(id<=0)
		{
			System.err.println("id is -ve not allowed...");
			System.exit(0);
		}
		else if(name.isBlank())
		{
			System.err.println("name null not allowed...");
			System.exit(0);
		}
		this.id = id;
		this.name = name;
		if(designation.equalsIgnoreCase("manager") || designation.equalsIgnoreCase("Developer") || designation.equalsIgnoreCase("Intern"))
		{
			this.designation = designation;
		}
		else
		{
			System.err.println("Employee designation is Invalid...");
			System.exit(0);
		}
		this.salary = salary;
	}
	
	

	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public String getDesignation() {
		return designation;
	}



	public double getSalary() {
		return salary;
	}



	@Override
	public String toString()
	{
		return "Employee Details: \nID : " + id + ", Name: " + name + ", Designation: " + designation + " Salary: " + salary;
	}
	
}
