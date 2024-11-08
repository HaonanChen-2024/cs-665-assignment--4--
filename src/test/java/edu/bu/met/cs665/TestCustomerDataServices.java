package edu.bu.met.cs665; /**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/8/2024
 * File Name: TestCustomerDataServices.java
 * Description: JUnit tests to verify the functionality of LegacyCustomerDataService,
 *              NewCustomerDataService, and CustomerDataAdapter.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCustomerDataServices {

    @Test
    public void testLegacyCustomerDataService() {
        CustomerDataService legacyService = new LegacyCustomerDataService();
        Customer customer = legacyService.getCustomerData(1);
        assertEquals("LegacyCustomer1", customer.getName());
        assertEquals(1, customer.getId());
    }

    @Test
    public void testNewCustomerDataService() {
        CustomerDataService newService = new NewCustomerDataService();
        Customer customer = newService.getCustomerData(2);
        assertEquals("NewCustomer2", customer.getName());
        assertEquals(2, customer.getId());
    }

    @Test
    public void testCustomerDataAdapter() {
        CustomerDataService adapterService = new CustomerDataAdapter(new NewCustomerDataService());
        Customer customer = adapterService.getCustomerData(3);
        assertEquals("NewCustomer3", customer.getName());
        assertEquals(3, customer.getId());
    }
}