package com.example.blog.service;

import com.example.blog.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    Blog findById(Long id);

    void save(Blog customer);

    void remove(Long id);
}