package com.user_defined.lambda;

import java.util.Scanner;

interface PalindromeChecker<T>
{
    boolean isPalindrome (T number);
}

public class PalindromeCheckerMain
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        PalindromeChecker<Integer> pc = num-> 
        {  
            int num1=num;
            int r=0;
            for(;num!=0;num/=10)
            {
                r= r*10+(num%10);
            }
            return num1==r;
        };

        PalindromeCheckerMain pl = new PalindromeCheckerMain();
        System.out.print("Enter the Num :");
        int num = sc.nextInt();
        pl.checkAndPrint(num,pc);
        sc.close();
    }
    

    public void checkAndPrint(int num, PalindromeChecker<Integer> checker)
    {
        if(num<0)
        {
            System.out.println("Output as: "+num+" is invalid input.");
            System.exit(0);
        }
        else
        {
            if(checker.isPalindrome(num)== true)
            {
                System.out.println("Output as: "+num+" is a palindrome.");
            }
            else
            {
                System.out.println("Output as: "+num+" is not a palindrome.");
            }
        }
        
    }

}

