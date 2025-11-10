package com.lambda.scenario;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FunctionApplier
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
//		Function<String,Integer> fn = str -> str.length();
//		Function<Integer,Double> fn1 = num -> num/2.0;
//		
//		System.out.print("Enter the String :");
//		String str = sc.nextLine();
//		
//		System.out.print("Enter the integer :");
//		int num = sc.nextInt();
//		
//		System.out.println("String length of \""+str+"\": "+fn.apply(str));
//		System.out.println("Result of dividing \""+num+"\" by 2: "+fn1.apply(num));
//		sc.close();
		Exception e1 = new FileNotFoundException();
		System.out.println(e1);
		System.out.println(sc.getClass().getEnumConstants());
	}
    

}
