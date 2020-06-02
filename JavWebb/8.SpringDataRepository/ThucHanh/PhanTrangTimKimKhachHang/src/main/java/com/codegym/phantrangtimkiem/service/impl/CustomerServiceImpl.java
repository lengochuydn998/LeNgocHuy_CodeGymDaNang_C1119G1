package com.codegym.phantrangtimkiem.service.impl;

import com.codegym.phantrangtimkiem.model.Customer;
import com.codegym.phantrangtimkiem.repository.CustomerRepository;
import com.codegym.phantrangtimkiem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Page<Customer> findAllByName(String name, Pageable pageable) {
        return customerRepository.findByNameContaining(name,pageable);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer findById(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(Integer id) {
        customerRepository.delete(customerRepository.findById(id).orElse(null));
    }
}
