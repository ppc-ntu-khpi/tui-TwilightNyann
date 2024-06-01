package com.mybank.tui;
import java.util.List;
import java.util.ArrayList;

public class Bank {
    private List<Customer> customers;

    public Bank() {
        customers = new ArrayList<>();
        // Add customers to the bank for demonstration purposes
        Customer customer1 = new Customer(1, "John Doe");
        customer1.addAccount(new Account("Checking", 200.00));
        customers.add(customer1);

        Customer customer2 = new Customer(2, "Jane Smith");
        customer2.addAccount(new Account("Savings", 500.00));
        customers.add(customer2);
    }

    public Customer getCustomer(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }
}



