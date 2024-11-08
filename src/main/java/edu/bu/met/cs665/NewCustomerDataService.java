package edu.bu.met.cs665;

/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/8/2024
 * File Name: NewCustomerDataService.java
 * Description: Implementation of CustomerDataService that simulates data retrieval
 *              from a new system through HTTPS and a REST API.
 */
public class NewCustomerDataService implements CustomerDataService {
    @Override
    public Customer getCustomerData(int customerId) {
        // Simulate retrieving data via HTTPS REST API
        System.out.println("Retrieving customer data from new system (HTTPS)...");
        return new Customer(customerId, "NewCustomer" + customerId);
    }
}
