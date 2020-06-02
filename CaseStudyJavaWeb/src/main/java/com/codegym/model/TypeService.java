package com.codegym.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TypeService {
    @Id
    private Integer id;
    private String nameTypeService;

    public TypeService() {
    }

    public TypeService(Integer id, String nameTypeService) {
        this.id = id;
        this.nameTypeService = nameTypeService;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameTypeService() {
        return nameTypeService;
    }

    public void setNameTypeService(String nameTypeService) {
        this.nameTypeService = nameTypeService;
    }
}
