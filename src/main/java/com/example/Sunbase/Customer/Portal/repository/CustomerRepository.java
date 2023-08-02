package com.example.Sunbase.Customer.Portal.repository;

import com.example.Sunbase.Customer.Portal.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
