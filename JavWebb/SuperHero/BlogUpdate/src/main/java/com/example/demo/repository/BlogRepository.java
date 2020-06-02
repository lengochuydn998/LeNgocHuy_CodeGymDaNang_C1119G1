package com.example.demo.repository;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Integer> {
    Page<Blog> findByNameContainingOrderByName(String name, Pageable pageable);
    Page<Blog> findBySubject_IdOrderByName(Integer id,Pageable pageable);
//    Page<Blog> findByNameContainingOrContentContaining(String name,String content, Pageable pageable);

}
