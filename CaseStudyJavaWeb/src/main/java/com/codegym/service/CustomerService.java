package com.codegym.service;

import com.codegym.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    void save(Customer customer);

    void remove(Integer id);

    Customer findById(Integer id);

    Page<Customer> findAllByName(String name,Pageable pageable);
}
