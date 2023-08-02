package com.example.Sunbase.Customer.Portal.service;


import com.example.Sunbase.Customer.Portal.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer customer);

    Customer updateCustomer(int id, Customer customer);

    void deleteCustomer(int id);

    Customer getCustomerById(int id);

    List<Customer> getAllCustomers();
}
