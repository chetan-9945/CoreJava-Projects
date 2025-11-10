package com.lambda.scenario;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class PasswordGenerator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String digits = "0123456789";
		String special = "@#$%!&*";
		
		String total = upper+lower+digits+special;// 69
		Random r = new Random();
		
		Supplier<String> sup = ()-> {
			String res = "";
			for(int i = 1;i<=8;i++) {
				res += total.charAt(r.nextInt(0,total.length()-1));
			}
			return res;
		};
		System.out.println(sup.get());
	sc.close();
	}

}
