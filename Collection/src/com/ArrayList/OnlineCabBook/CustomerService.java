package com.ArrayList.OnlineCabBook;

import java.util.ArrayList;

public class CustomerService {
    private ArrayList<Customer> customers;

    public CustomerService() {
        this.customers = new ArrayList<>();
    }

    public boolean isEmpty() {
        return customers.isEmpty();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean isOldCustomer(String phone) {
        for (Customer cust : customers) {
            if (cust.phone().equals(phone)) {
                return true;
            }
        }
        return false;
    }

    private boolean isFirstCustomer(Customer customer) {
        return !isOldCustomer(customer.phone());
    }

    private double calculateBill(Customer customer) {
        if (isFirstCustomer(customer)) {
            return 0.0;
        } else if (customer.distance() > 0 && customer.distance() <= 4) {
            return 80.0;
        } else {
            return 80.0 + (customer.distance() * 6.0);
        }
    }

    public void printBill(Customer customer) {
        double bill = calculateBill(customer);
        System.out.println(customer.customerName().toUpperCase() + " Please pay your bill of Rs." + bill);
        addCustomer(customer);
    }
}
