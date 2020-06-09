package codegym.onthimodule2.service;

import codegym.onthimodule2.model.People;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PeopleService {
    void save (People people);

    void delete(Integer id);

    People findById(Integer id);

    Page<People> findAllByName(String name,String job, Pageable pageable);

    Page<People> findAll(Pageable pageable);



}
