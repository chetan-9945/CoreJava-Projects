package com.lambda.scenario;
import java.util.Scanner;
import java.util.function.*;

public class Demo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		BiFunction<Integer,Double,String> op = (num,num1) -> 
		{
			return "Result of "+num+" Power "+num1+" is : "+Math.pow(num, num1);
		};
		
		System.out.print("Enter the Digit and power of digit :");
		int str1 = sc.nextInt();
		int str = sc.nextInt();
		System.out.println(op.apply(str1,(double)str));
		sc.close();
	}
}