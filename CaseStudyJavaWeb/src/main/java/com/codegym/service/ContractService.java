package com.codegym.service;

import com.codegym.model.Contract;
import com.codegym.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ContractService {
    Page<Contract> findAll(Pageable pageable);

    void save(Contract contract);

    void remove(Integer id);

    Contract findById(Integer id);

    List<Customer> findCustomerUsing();

    List<Customer> abc(String endDay);
}
