package com.example.casestudy.dto;

import com.example.casestudy.model.CustomerType;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class CustomerDTO {
    private Long id;
    private CustomerType customerTypeId;
    @NotBlank
    private String name;

    private String birthDay;
    private String gender;

    @NotBlank
    @Pattern(message = "CMND phải đúng định dạng XXXXXXXXX hoặc XXXXXXXXXXXX (X là số 0-9)", regexp =  "[0-9]{9}")
    private String card;

    @NotBlank
    @Pattern(message = "Số điện thoại phải đúng định dạng 090xxxxxxx hoặc 091xxxxxxx hoặc (84)+90xxxxxxx hoặc (84)+91xxxxxxx",
            regexp = "^(090\\d{7})|(091\\d{7})|(8490\\d{7})|(8491\\d{7})|(082\\d{7})$")
    private String phone;

    @NotBlank
    @Pattern(message = "Địa chỉ email phải đúng định dạng email",regexp = "^([\\w]*[\\w\\.]*(?!\\.)@gmail.com)")
    private String email;
    private String address;

    public CustomerDTO() {
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


    @Override
    public String toString() {
        return "CustomerDto{" +
                "id=" + id +
                ", customerTypeId=" + customerTypeId +
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                ", card='" + card + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
