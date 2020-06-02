package com.codegym.service;

import com.codegym.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    void save (Product product);

    Page<Product> findAll(Pageable pageable);

    Product findById(Integer id);

    void remove(Integer id);
}
