package com.example.Sunbase.Customer.Portal.service.Impl;

import com.example.Sunbase.Customer.Portal.model.Customer;
import com.example.Sunbase.Customer.Portal.repository.CustomerRepository;
import com.example.Sunbase.Customer.Portal.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(int id, Customer customer) {
        Customer existingCustomer = getCustomerById(id);
        if (existingCustomer != null) {
            customer.setId(id);
            return customerRepository.save(customer);
        }
        return null;
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer getCustomerById(int id) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        return optionalCustomer.orElse(null);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
