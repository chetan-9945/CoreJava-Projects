package com.lambda;

import java.util.Scanner;

public class EmployeeBonusSystem
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Employee id :");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("Enter your Employee name :");
		String name = sc.nextLine();
		System.out.print("Enter your Employee designation :");
		String designation = sc.nextLine();
		System.out.print("Enter your Employee salary :");
		double salary = Integer.parseInt(sc.nextLine());
		System.out.print("Enter employee rating :");
		int rating = Integer.parseInt(sc.nextLine());
		Employee ep = new Employee(id,name,designation,salary);
		
		BonusCalculator bc = salary1 ->
			{
				if(designation.equalsIgnoreCase("manager"))
				{
					return salary*0.2;
				}
				else if(designation.equalsIgnoreCase("developer"))
				{
					return salary*0.15;
				}
				else if(designation.equalsIgnoreCase("Intern "))
				{
					return salary*0.05;
				}
				else 
				{
					return 0;
				}
			
			};
	
		
		PerformanceEvaluator pe = rating1 ->
		{
			if(rating == 5)
			{
				return "Outstanding";
			}
			else if(rating == 4)
			{
				return "Excellent";
			}
			else if(rating == 3)
			{
				return "Good";
			}
			else 
			{
				return "Needs Improvement";
			}
	
		};
		
		System.out.println(ep.toString());
		System.out.println("Bonus: "+bc.calculateBonus(salary));
		System.out.println("Performance: "+pe.evaluatePerformance(rating));
	
	}

}
