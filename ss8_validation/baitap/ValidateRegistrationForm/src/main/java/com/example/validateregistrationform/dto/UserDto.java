package com.example.validateregistrationform.dto;

import org.hibernate.validator.constraints.Length;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserDto implements Validator {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Size(message = "Firstname, lastname bắt buộc, có độ dài tối thiểu 5, tối đa 45 ký tự",min = 5, max = 45)
    private String firstName;
    @Size(message = "Lastname, lastname bắt buộc, có độ dài tối thiểu 5, tối đa 45 ký tự",min = 5, max = 45)
    private String lastName;
    @Pattern(message = "Phonenumber đúng quy tắc của sđt", regexp = "(84|0[3|5|7|8|9])+([0-9]{8})\\b")
    private String phone;
    @Email(message = "Email đúng quy tắc của email")
    private String email;
//    @Length(message = "Age >=18", min = 17)
    private int age;

    public UserDto() {
    }

    public UserDto(int id, @Size(message = "Firstname, lastname bắt buộc, có độ dài tối thiểu 5, tối đa 45 ký tự",min = 5, max = 45)
            String firstName, @Size(message = "Lastname, lastname bắt buộc, có độ dài tối thiểu 5, tối đa 45 ký tự",min = 5, max = 45)
            String lastName, @Pattern(message = "Phonenumber đúng quy tắc của sđt", regexp = "(84|0[3|5|7|8|9])+([0-9]{8})\\b")
            String phone, @Email(message = "Email đúng quy tắc của email")
            String email, @Size(message = "Age >=18", min = 17)
            int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.age = age;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto = (UserDto) target;
    }
}
