package edu.bu.met.cs665;

/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/8/2024
 * File Name: LegacyCustomerDataService.java
 * Description: Implementation of CustomerDataService that simulates data retrieval
 *              from a legacy system through a USB connection.
 */
public class LegacyCustomerDataService implements CustomerDataService {
    @Override
    public Customer getCustomerData(int customerId) {
        // Simulate retrieving data via USB connection
        System.out.println("Retrieving customer data from legacy system (USB)...");
        return new Customer(customerId, "LegacyCustomer" + customerId);
    }
}
