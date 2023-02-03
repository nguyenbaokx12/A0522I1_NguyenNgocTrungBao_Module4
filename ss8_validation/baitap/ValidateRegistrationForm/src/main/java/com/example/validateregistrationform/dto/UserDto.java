package com.example.validateregistrationform.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserDto implements Validator {
    private int id;
    @Size(message = "Firstname, lastname bắt buộc, có độ dài tối thiểu 5, tối đa 45 ký tự",min = 5, max = 45)
    private String firstName;
    @Size(message = "Lastname, lastname bắt buộc, có độ dài tối thiểu 5, tối đa 45 ký tự",min = 5, max = 45)
    private String lastName;
    @Pattern(message = "Phonenumber đúng quy tắc của sđt", regexp = "(84|0[3|5|7|8|9])+([0-9]{8})\\b")
    private String phone;
    @Email(message = "Email đúng quy tắc của email")
    private String email;
    @Size(message = "Age >=18", min = 17)
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
