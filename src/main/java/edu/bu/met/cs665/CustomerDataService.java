package edu.bu.met.cs665;

/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/8/2024
 * File Name: CustomerDataService.java
 * Description: Interface defining a standard method for accessing customer data.
 */
public interface CustomerDataService {
    /**
     * Retrieve customer data by customer ID.
     * @param customerId ID of the customer to retrieve.
     * @return Customer object containing customer details.
     */
    Customer getCustomerData(int customerId);
}
