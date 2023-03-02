package com.example.casestudy.model;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(targetEntity = CustomerType.class)
    private CustomerType customerTypeId;
    private String name;
    private String birthDay;
    private String gender;
    private String card;
    private String phone;
    private String email;
    private String address;

    public Customer() {
    }

    public Customer(Long id) {
        this.id = id;
    }

    public Customer(Long id, CustomerType customerTypeId, String name, String birthDay,
                    String gender, String card, String phone, String email, String address) {
        this.id = id;
        this.customerTypeId = customerTypeId;
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.card = card;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CustomerType getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(CustomerType customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
