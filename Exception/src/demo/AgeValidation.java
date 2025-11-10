package demo;

import java.util.Scanner;
public class AgeValidation
{
    public static void main(String [] args )
    {
            Scanner sc = new Scanner(System.in);
            String age = sc.next();
            Validator vl = new Validator();
          
            try
            {
                int age1 = Integer.parseInt(age);
                if(age1 < 0)
                {
                    System.out.println("Error Invalid Input");
                }
                else
                {
                    vl.checkAge(age1);
                }
            }
            catch(NumberFormatException | InvalidAgeException e)
            {
                if(e instanceof NumberFormatException)
                {
                    System.out.println("Error Invalid Input");
                }
                else
                {
                    System.out.println(e.getMessage());
               }
            }
    }
}

class InvalidAgeException extends Exception
{
    public InvalidAgeException()
    {

    }

    public InvalidAgeException(String errorMessage)
    {
        super(errorMessage);
    }
}

class Validator 
{
    public void checkAge(int age) throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("Age must be at least 18");
        }
        else
        {
            System.out.println("Access granted");
        }
    }
}
