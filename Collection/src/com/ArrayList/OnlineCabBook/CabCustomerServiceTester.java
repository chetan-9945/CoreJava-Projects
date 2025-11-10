package com.ArrayList.OnlineCabBook;

import java.util.Scanner;

public class CabCustomerServiceTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerService cs = new CustomerService();

        while (true) {
            System.out.println("\n\tOnline Cab Booking Menu");
            System.out.println("----------------------------");
            System.out.println("1. Add Customer & Print Bill");
            System.out.println("2. Show All Customers");
            System.out.println("3. Check if Customer is New or Existing");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: 
                    try {
                        System.out.print("Enter the ID: ");
                        int id = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter the Customer Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter the Pickup Location: ");
                        String pickupLocation = sc.nextLine();

                        System.out.print("Enter the Drop Location: ");
                        String dropLocation = sc.nextLine();

                        System.out.print("Enter the Distance: ");
                        int distance = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter the Phone Number: ");
                        String phone = sc.nextLine();

                        Customer ct = new Customer(id, name, pickupLocation, dropLocation, distance, phone);

                        cs.printBill(ct);

                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2: 
                    if (cs.isEmpty()) {
                        System.out.println("No customers found.");
                    } else {
                        System.out.println("\tAll Customers");
                        System.out.println("----------------------------");
                        cs.getCustomers().forEach(c -> 
                            System.out.println(c.custId() + " | " + c.customerName() + " | " + c.phone())
                        );
                    }
                    break;

                case 3: 
                    System.out.print("Enter phone number to check: ");
                    String phoneCheck = sc.nextLine();
                    if (cs.isOldCustomer(phoneCheck)) {
                        System.out.println("This is an Old customer.");
                    } else {
                        System.out.println("This is a NEW customer.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using....");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!...");
            }
        }
    }
}
