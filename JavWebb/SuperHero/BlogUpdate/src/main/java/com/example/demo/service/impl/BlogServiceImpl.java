package com.example.demo.service.impl;

import com.example.demo.model.Blog;
import com.example.demo.repository.BlogRepository;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.OneToMany;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;
    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public Blog findById(Integer id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Page<Blog> findAllByNameOrderBy(String name, Pageable pageable) {
        return blogRepository.findByNameContainingOrderByName(name,pageable);
    }
//    @Override
//    public Page<Blog> findAllByNameOrderBy(String name,String content, Pageable pageable) {
//        return blogRepository.findByNameContainingOrderByName(name,content,pageable);
//    }

    @Override
    public void remove(Integer id) {
        blogRepository.delete(blogRepository.findById(id).orElse(null));
    }

    @Override
    public Page<Blog> findBySubject_Id(Integer id, Pageable pageable) {
        return blogRepository.findBySubject_IdOrderByName(id,pageable);
    }
}
