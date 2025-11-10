package com.user_defined.lambda;

import java.util.Scanner;

interface DivisorSumCalculator<T>
{
    int sumOfDivisors(T number);
}

public class DivisorLambdaELC
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        DivisorSumCalculator<Integer> pc = num-> 
        {  
            int sum=0;
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                sum+=i;
            }
            return sum;
        };

        DivisorLambdaELC pl = new DivisorLambdaELC();
        System.out.print("Enter the Num :");
        int num = sc.nextInt();
        pl.checkAndPrint(num,pc);
        sc.close();
    }
    

    public void checkAndPrint(int num, DivisorSumCalculator<Integer> checker)
    {
        if(num<1)
        {
            System.out.println("Output as: "+num+" is invalid input.");
            System.exit(0);
        }
        else
        {
             System.out.println("Output as: Sum of divisors of "+num+" is "+checker.sumOfDivisors(num));
        }
    }

}

