package com.kv.javabasics.challenges.bankchallenge;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        Customer customer = findCustomer(customerName);
        if(customer == null) {
            return customers.add(new Customer(customerName, initialTransaction));
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if(customer!= null) {
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for(int i=0; i<this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}
