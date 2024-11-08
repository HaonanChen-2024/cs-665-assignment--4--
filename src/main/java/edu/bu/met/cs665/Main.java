package edu.bu.met.cs665;

/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/8/2024
 * File Name: Main.java
 * Description: Main class to test the functionality of LegacyCustomerDataService,
 *              NewCustomerDataService, and CustomerDataAdapter.
 */
public class Main {
    public static void main(String[] args) {
        // Using legacy system directly
        CustomerDataService legacyService = new LegacyCustomerDataService();
        System.out.println("Legacy Service Output:");
        Customer legacyCustomer = legacyService.getCustomerData(1);
        System.out.println(legacyCustomer);

        // Using new system directly
        CustomerDataService newService = new NewCustomerDataService();
        System.out.println("\nNew Service Output:");
        Customer newCustomer = newService.getCustomerData(2);
        System.out.println(newCustomer);

        // Using adapter to access new service as legacy
        CustomerDataService adapterService = new CustomerDataAdapter(new NewCustomerDataService());
        System.out.println("\nAdapter Service Output:");
        Customer adaptedCustomer = adapterService.getCustomerData(3);
        System.out.println(adaptedCustomer);
    }
}
