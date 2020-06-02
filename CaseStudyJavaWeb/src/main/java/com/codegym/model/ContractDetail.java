package com.codegym.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    private Contract contract;

    @OneToMany
    private List<AccompaniedService> accompaniedServiceList;


    private String amount;

}
