package com.codegym.service.impl;

import com.codegym.model.TypeService;
import com.codegym.repository.TypeServiceRepository;
import com.codegym.service.TypeServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeServiceServiceImpl implements TypeServiceService {
    @Autowired
    TypeServiceRepository typeServiceRepository;
    @Override
    public List<TypeService> findAllTypeService() {
        return typeServiceRepository.findAll();
    }
}
