package com.codegym.model;

import javax.persistence.*;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    private Staff staff;

    @OneToOne
    private Customer customer;

    @OneToOne
    private Service service;

    private String dayStartContact;
    private String dayEndContact;
    private String deposits;
    private String totalMoney;

    public Contract() {
    }

    public Contract(Staff staff, Customer customer, Service service, String dayStartContact, String dayEndContact, String deposits, String totalMoney) {
        this.staff = staff;
        this.customer = customer;
        this.service = service;
        this.dayStartContact = dayStartContact;
        this.dayEndContact = dayEndContact;
        this.deposits = deposits;
        this.totalMoney = totalMoney;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public String getDayStartContact() {
        return dayStartContact;
    }

    public void setDayStartContact(String dayStartContact) {
        this.dayStartContact = dayStartContact;
    }

    public String getDayEndContact() {
        return dayEndContact;
    }

    public void setDayEndContact(String dayEndContact) {
        this.dayEndContact = dayEndContact;
    }

    public String getDeposits() {
        return deposits;
    }

    public void setDeposits(String deposits) {
        this.deposits = deposits;
    }

    public String getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(String totalMoney) {
        this.totalMoney = totalMoney;
    }
}
