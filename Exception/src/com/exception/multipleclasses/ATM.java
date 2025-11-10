package com.exception.multipleclasses;

import java.util.Scanner;
import com.custom.exception.*;

public class ATM 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BankAccount acc1 = null;
        BankAccount acc2 = null;
        Customer cust1 = null;
        Customer cust2 = null;

        try {
            acc1 = new BankAccount(45, 45000);
            acc2 = new BankAccount(46, 55000);
            cust1 = new Customer("chetan", acc1);
            cust2 = new Customer("aditya", acc2);
        } 
        catch (InvalidNameException | AccountNotFoundException | InvalidAmountException e) 
        {
            System.out.println(e.getMessage());
            sc.close();
            return;
        }

        while (true) {
            System.out.println("----------------------");
            System.out.print(
                    "           1. Deposit\r\n" +
                    "           2. Withdraw\r\n" +
                    "           3. Transfer\r\n" +
                    "           4. Loan Application\r\n" +
                    "           5. Check Balance\r\n" +
                    "           6. Exit\r\n" +
                    "Select an option :");

            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Choice should be Number Format only...");
                continue;
            }

            switch (choice) {
                case 1:
                    handleTransaction("Deposit", sc, cust1, cust2);
                    break;

                case 2:
                    handleTransaction("Withdraw", sc, cust1, cust2);
                    break;

                case 3:
                    handleTransfer(sc, cust1, cust2);
                    break;

                case 4:
                    handleTransaction("Loan", sc, cust1, cust2);
                    break;

                case 5:
                    handleBalanceCheck(sc, cust1, cust2);
                    break;

                case 6:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void handleTransaction(String type, Scanner sc, Customer cust1, Customer cust2) 
    {
        System.out.print("Enter Customer Name :");
        String cName = sc.nextLine().toLowerCase();
        Customer customer = getCustomerByName(cName, cust1, cust2);

        if (customer == null) {
            System.out.println("Account is Invalid...");
            return;
        }

        System.out.print("Enter the Amount :");
        double tAmt;
        try {
            tAmt = Double.parseDouble(sc.nextLine());

            switch (type) {
                case "Deposit":
                    customer.getAccount().deposit(tAmt);
                    break;
                case "Withdraw":
                    customer.getAccount().withdraw(tAmt);
                    break;
                case "Loan":
                    customer.getAccount().applyForLoan(tAmt);
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Amount Must be Number Format Only...");
        } catch (InvalidAmountException | InsufficientFundsException | LoanNotAllowedException e) 
        {
            System.out.println(e.getMessage());
        }
    }

    private static void handleTransfer(Scanner sc, Customer cust1, Customer cust2) {
        System.out.print("Enter Sender Customer Name :");
        String senderName = sc.nextLine().toLowerCase();
        Customer sender = getCustomerByName(senderName, cust1, cust2);

        if (sender == null) {
            System.out.println("Sender Account is Invalid...");
            return;
        }

        System.out.print("Enter Recipient Customer Name :");
        String recipientName = sc.nextLine().toLowerCase();
        Customer recipient = getCustomerByName(recipientName, cust1, cust2);

        if (recipient == null) {
            System.out.println("Recipient Account is Invalid...");
            return;
        }

        System.out.print("Enter the Transfer Amount :");
        double tAmt;
        try {
            tAmt = Double.parseDouble(sc.nextLine());
            sender.getAccount().transfer(recipient.getAccount(), tAmt);
        } catch (NumberFormatException e) {
            System.out.println("Amount Must be Number Format Only...");
        } catch (InvalidAmountException | InsufficientFundsException | AccountNotFoundException e) 
        {
            System.out.println(e.getMessage());
        }
    }

    private static void handleBalanceCheck(Scanner sc, Customer cust1, Customer cust2) {
        System.out.print("Enter Customer Name :");
        String cName = sc.nextLine().toLowerCase();
        Customer customer = getCustomerByName(cName, cust1, cust2);

        if (customer != null) {
            System.out.println("The Account No is " + customer.getAccount().getAccountNumber()
                    + " & Balance is :" + customer.getAccount().getBalance());
        } else {
            System.out.println("Account is Invalid...");
        }
    }

    private static Customer getCustomerByName(String name, Customer c1, Customer c2) {
        if (c1.getName().equalsIgnoreCase(name)) return c1;
        if (c2.getName().equalsIgnoreCase(name)) return c2;
        return null;
    }
}
