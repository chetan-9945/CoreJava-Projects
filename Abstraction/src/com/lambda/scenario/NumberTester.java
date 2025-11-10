package com.lambda.scenario;
import java.util.Scanner;
import java.util.function.Predicate;

public class NumberTester 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Predicate<Integer> pd = num-> num%2==0;
		
		Predicate<Integer> pd1 = num-> 
		{
		    for(int i=2; i<=num/2; i++) 
		    if(num%i==0) return false;
		    return true;
		};
		
		System.out.print("Enter the value for num :");
		int num = sc.nextInt();
		System.out.println("Is "+num+" even?"+pd.test(num));
		System.out.println("Is "+num+" prime?"+pd1.test(num));
		sc.close();
	}
}
