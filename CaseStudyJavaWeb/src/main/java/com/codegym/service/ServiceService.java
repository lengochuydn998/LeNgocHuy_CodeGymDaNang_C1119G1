package com.codegym.service;

import com.codegym.model.Customer;
import com.codegym.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ServiceService {
    Page<Service> findAll(Pageable pageable);

    void save(Service service);

    void remove(Integer id);

    Service findById(Integer id);

    Page<Service> findAllByName(String nameService,Pageable pageable);
}
