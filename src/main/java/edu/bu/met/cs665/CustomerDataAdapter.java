package edu.bu.met.cs665;

/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/8/2024
 * File Name: CustomerDataAdapter.java
 * Description: Adapter class that allows the new system's data access method to be
 *              used as if it were the legacy system.
 */
public class CustomerDataAdapter implements CustomerDataService {
    private final NewCustomerDataService newCustomerDataService;

    /**
     * Constructor for CustomerDataAdapter that accepts an instance of
     * NewCustomerDataService to adapt its methods.
     *
     * @param newCustomerDataService an instance of NewCustomerDataService.
     */
    public CustomerDataAdapter(NewCustomerDataService newCustomerDataService) {
        this.newCustomerDataService = newCustomerDataService;
    }

    /**
     * Retrieve customer data by customer ID, using the new system's data access
     * method but adapting it to match the legacy system's expectations.
     *
     * @param customerId the ID of the customer to retrieve.
     * @return Customer object containing customer details from the new system.
     */
    @Override
    public Customer getCustomerData(int customerId) {
        System.out.println("Using adapter to access new system as if it's the legacy system...");
        return newCustomerDataService.getCustomerData(customerId);
    }
}
