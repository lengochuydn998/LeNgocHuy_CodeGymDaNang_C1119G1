package com.codegym.model;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    private TypeRent typeRent;
    @OneToOne
    private TypeService typeService;

    @NotEmpty
    private String nameService;

    @NotEmpty
    private String areService;

    @NotEmpty
    private String numberOfFloors;

    @NotEmpty
    private String numberMaxOfPeoples;

    @NotEmpty
    private String priceRent;

    @NotEmpty
    private String status;

    public Service() {
    }

    public Service(TypeRent typeRent, TypeService typeService, String nameService, String areService, String numberOfFloors, String numberMaxOfPeoples, String priceRent, String status) {
        this.typeRent = typeRent;
        this.typeService = typeService;
        this.nameService = nameService;
        this.areService = areService;
        this.numberOfFloors = numberOfFloors;
        this.numberMaxOfPeoples = numberMaxOfPeoples;
        this.priceRent = priceRent;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TypeRent getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(TypeRent typeRent) {
        this.typeRent = typeRent;
    }

    public TypeService getTypeService() {
        return typeService;
    }

    public void setTypeService(TypeService typeService) {
        this.typeService = typeService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getAreService() {
        return areService;
    }

    public void setAreService(String areService) {
        this.areService = areService;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getNumberMaxOfPeoples() {
        return numberMaxOfPeoples;
    }

    public void setNumberMaxOfPeoples(String numberMaxOfPeoples) {
        this.numberMaxOfPeoples = numberMaxOfPeoples;
    }

    public String getPriceRent() {
        return priceRent;
    }

    public void setPriceRent(String priceRent) {
        this.priceRent = priceRent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
