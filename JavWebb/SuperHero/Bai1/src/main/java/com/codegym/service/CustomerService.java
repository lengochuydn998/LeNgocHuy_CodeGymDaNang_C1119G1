package com.codegym.service;

import com.codegym.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByName(String name,Pageable pageable);

    void save(Customer customer);

    Customer findById(Integer id);

    void remove(Integer id);
}
