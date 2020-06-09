package codegym.onthimodule2.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @Pattern(regexp = "^[\\d]{9,12}$",message = "Id Card không đúng định dạng")
    private String idCard;

    @Pattern(regexp = "(090|091\\+8490|\\+8491)+([0-9]{7})\\b",message = "Số điện thoại không đúng định dạng")
    private String number_Phone;

    @NotEmpty
    private String job;

    @OneToOne
    private Address address;

    public People() {
    }

    public People(String name, Date birthday, String idCard, String number_Phone, String job, Address address) {
        this.name = name;
        this.birthday = birthday;
        this.idCard = idCard;
        this.number_Phone = number_Phone;
        this.job = job;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getNumber_Phone() {
        return number_Phone;
    }

    public void setNumber_Phone(String number_Phone) {
        this.number_Phone = number_Phone;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
