package com.codegym.service.impl;

import com.codegym.model.Contract;
import com.codegym.model.Customer;
import com.codegym.repository.ContractRepository;
import com.codegym.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    ContractRepository contractRepository;
    @Override
    public Page<Contract> findAll(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public void remove(Integer id) {
        contractRepository.deleteById(id);
    }

    @Override
    public Contract findById(Integer id) {
        return contractRepository.findById(id).orElse(null);
    }

    @Override
    public List<Customer> findCustomerUsing() {
        List<Customer> cusUsing= new LinkedList<>();
        List<Contract> contracts = contractRepository.findAll();
        for (Contract item: contracts) {
            if (item.getDayEndContact() == null || item.getDayEndContact().equals("")){
                cusUsing.add(item.getCustomer());
            }
        }
        return cusUsing;
    }

    @Override
    public List<Customer> abc(String endDay) {
        List<Customer> customers = new LinkedList<>();
        List<Contract> contracts = contractRepository.findAllByDayEndContact(endDay);
        for (Contract contract: contracts) {
            customers.add(contract.getCustomer());
        }
        return customers;
    }

}
