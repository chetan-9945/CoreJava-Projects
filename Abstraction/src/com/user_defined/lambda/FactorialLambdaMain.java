package com.user_defined.lambda;

import java.util.Scanner;

interface FactorialCalculator<T>
{
    long calculate(T number);
}

public class FactorialLambdaMain
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        FactorialCalculator<Integer> pc = num-> 
        {
           int fact=1;
           for(int i=1;i<=num;i++)
           {
              fact*=i;
           }
           return fact;
        };

        FactorialLambdaMain pl = new FactorialLambdaMain(); 
        System.out.print("Enter the Num :");
        int num = sc.nextInt();
        pl.checkAndPrint(num,pc);
        sc.close();
    }
    

    public void checkAndPrint(int num, FactorialCalculator<Integer> calculator)
    {
        if(num<2)
        {
            if(num<0)
            {
                System.out.println("Output as: "+num+" is invalid input.");
                System.exit(0);
            }
            System.out.println("Output as: Factorial of "+num+" is 1");
            System.exit(0);
        }
        else
        {
            System.out.println("Output as: Factorial of "+num+" is "+calculator.calculate(num));
        }
    }

}

