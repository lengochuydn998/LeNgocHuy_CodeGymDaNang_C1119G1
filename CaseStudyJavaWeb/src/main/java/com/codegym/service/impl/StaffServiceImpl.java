package com.codegym.service.impl;

import com.codegym.model.Staff;
import com.codegym.repository.StaffRepository;
import com.codegym.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    StaffRepository staffRepository;
    @Override
    public List<Staff> findAll() {
        return staffRepository.findAll();
    }
}
