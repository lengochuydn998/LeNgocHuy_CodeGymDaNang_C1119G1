package com.codegym.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Part {
    @Id
    private Integer id;
    private String namePart;

}
