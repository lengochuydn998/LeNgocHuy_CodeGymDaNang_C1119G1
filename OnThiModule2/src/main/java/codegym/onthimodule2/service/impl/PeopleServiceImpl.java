package codegym.onthimodule2.service.impl;

import codegym.onthimodule2.model.Address;
import codegym.onthimodule2.model.People;
import codegym.onthimodule2.repository.AddressRepository;
import codegym.onthimodule2.repository.PeopleRepository;
import codegym.onthimodule2.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.ListUtils;

import java.util.LinkedList;
import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    PeopleRepository peopleRepository;
    @Override
    public void save(People people) {
        peopleRepository.save(people);
    }

    @Override
    public void delete(Integer id) {
        peopleRepository.deleteById(id);
    }

    @Override
    public People findById(Integer id) {
        return peopleRepository.findById(id).orElse(null);
    }

    @Override
    public Page<People> findAllByName(String name,String job, Pageable pageable) {
        return peopleRepository.findAllByNameContainingOrJobContainingOrderByName(name,job,pageable);
    }

    @Override
    public Page<People> findAll(Pageable pageable) {
        return peopleRepository.findAll(pageable);
    }



}
