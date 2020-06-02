package com.codegym.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccompaniedService {
    @Id
    private Integer id;
    private String nameAccompaniedService;
    private String price;
    private String unit;
    private String status;
}
