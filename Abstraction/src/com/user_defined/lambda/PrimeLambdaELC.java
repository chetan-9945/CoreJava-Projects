package com.user_defined.lambda;

import java.util.Scanner;
//import java.util.function.Predicate;

interface PrimeChecker<T>
{
    boolean isPrime(T number);
}

public class PrimeLambdaELC
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        PrimeChecker<Integer> pc = num-> 
       // Predicate<Integer> pc = num ->
        {
            for(int i=2;i<=num/2;i++)
            {
                if(num%i==0) return false;
            }
            return true;
        };

        PrimeLambdaELC pl = new PrimeLambdaELC();
        System.out.print("Enter the Num :");
        int num = sc.nextInt();
        pl.checkAndPrint(num,pc);
        sc.close();
    }
    
    

    public void checkAndPrint(int num, PrimeChecker<Integer> checker) //Predicate<Integer> checker
    {
        if(num<2)
        {
            System.out.println("Output as: "+num+" is invalid input. ");
            System.exit(0);
        }
        else
        {
            if(checker.isPrime(num)== true) //checker.test(num)== true
            {
                System.out.println("Output as: "+num+" is a prime number.");
            }
            else
            {
             System.out.println("Output as: "+num+" is not a prime number.");
            }
        }
    }
}
