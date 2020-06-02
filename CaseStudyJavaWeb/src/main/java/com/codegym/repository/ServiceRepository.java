package com.codegym.repository;

import com.codegym.model.Customer;
import com.codegym.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service,Integer> {
    Page<Service> findAllByNameServiceContainingOrderByNameService(String nameService, Pageable pageable);
}
