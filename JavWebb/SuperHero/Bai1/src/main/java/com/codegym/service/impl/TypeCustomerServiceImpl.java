package com.codegym.service.impl;

import com.codegym.model.TypeCustomer;
import com.codegym.service.TypeCustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeCustomerServiceImpl implements TypeCustomerService {
    TypeCustomerService typeCustomerService;
    @Override
    public List<TypeCustomer> findAll() {
        return typeCustomerService.findAll();
    }
}
