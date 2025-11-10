package com.lambda.scenario;

import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifier {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Consumer<String> cd = str -> System.out.println("After converting string to uppercase: "+str.toUpperCase());
		Consumer<Integer> cd1 = num -> System.out.println("After squaring the integer: "+(num*num));

		System.out.println("Enter the String :");
		String str = sc.nextLine();
		System.out.println("Enter the Integer value :");
		int num = sc.nextInt();
		
		cd.accept(str);
		cd1.accept(num);
		sc.close();
	}

}
