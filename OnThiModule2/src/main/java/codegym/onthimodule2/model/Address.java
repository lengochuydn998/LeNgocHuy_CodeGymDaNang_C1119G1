package codegym.onthimodule2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name_address;

    public Address() {
    }

    public Address(String name_address) {
        this.name_address = name_address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_address() {
        return name_address;
    }

    public void setName_address(String name_address) {
        this.name_address = name_address;
    }
}
