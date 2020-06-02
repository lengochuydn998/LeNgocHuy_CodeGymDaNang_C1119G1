package com.codegym.repository;

import com.codegym.model.Contract;
import com.codegym.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContractRepository  extends JpaRepository<Contract,Integer> {
    List<Contract> findAllByDayEndContact(String dayEnd);
}
