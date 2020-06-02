package com.example.demo.service;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.persistence.criteria.CriteriaBuilder;

public interface BlogService {
    void save(Blog blog);

    Blog findById(Integer id);

    Page<Blog> findAll(Pageable pageable);

    Page<Blog> findAllByNameOrderBy(String name,Pageable pageable);
//    Page<Blog> findAllByNameOrderBy(String name,String content,Pageable pageable);

    void remove(Integer id);

    Page<Blog> findBySubject_Id(Integer id,Pageable pageable);

}
