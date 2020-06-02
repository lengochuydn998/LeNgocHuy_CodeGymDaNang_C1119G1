package com.codegym.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Position {
    @Id
    private Integer id;
    private String namePosition;
}
