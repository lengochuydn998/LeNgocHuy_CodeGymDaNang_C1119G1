package com.codegym.service.impl;

import com.codegym.model.TypeRent;
import com.codegym.repository.TypeRentRepository;
import com.codegym.service.TypeRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeRentServiceImpl implements TypeRentService {
    @Autowired
    TypeRentRepository typeRentRepository;
    @Override
    public List<TypeRent> findAllTypeRent() {
        return typeRentRepository.findAll();
    }
}
