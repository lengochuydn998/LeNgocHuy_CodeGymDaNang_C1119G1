package com.codegym.service.impl;

import com.codegym.model.Service;
import com.codegym.repository.ServiceRepository;
import com.codegym.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    ServiceRepository serviceRepository;
    @Override
    public Page<Service> findAll(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public void save(Service service) {
        serviceRepository.save(service);
    }

    @Override
    public void remove(Integer id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public Service findById(Integer id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Service> findAllByName(String nameService, Pageable pageable) {
        return serviceRepository.findAllByNameServiceContainingOrderByNameService(nameService,pageable);
    }
}
