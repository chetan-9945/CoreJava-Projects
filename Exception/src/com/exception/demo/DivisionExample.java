package com.exception.demo;
import java.util.Scanner;

public class DivisionExample {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the num1 :");
		int num= sc.nextInt();
		//System.out.println("Enter the num2 :");
		int num1= sc.nextInt();
		try {
		System.out.println("Result of division: "+performDivision(num, num1));
		}
		catch(ArithmeticException e)
		{
			System.err.println("ArithmeticException caught: Division by zero: dividend=:"+num+", divisor="+num1);
		}
	}
	
	public static int performDivision(int num,int num1)
	{
		return num/num1;
	}

}
