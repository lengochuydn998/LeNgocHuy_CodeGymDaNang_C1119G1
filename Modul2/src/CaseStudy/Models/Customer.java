package CaseStudy.Models;

public class Customer {
    private String fullName;
    private String birthday;
    private String gender;
    private String idCard;
    private String phone;
    private String email;
    private String customerType;
    private String address;
    private String services;

    public Customer() {
    }

    public Customer(String fullName, String birthday, String gender, String idCard, String phone, String email, String customerType, String address, String services) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
        this.services = services;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }
    public void showInfo(){
        System.out.println("Full name: "+this.fullName+"\nBirthday: "+this.birthday+"\nGender: "+this.gender
        +"\nId Card: "+this.idCard+"\nPhone: "+this.phone+"\nEmail: "+this.email+"\nCustomer Type: "+this.customerType
        +"\nAddress: "+this.address);
    }
}
