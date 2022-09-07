package com.example.week32.dto;

import lombok.Data;

import javax.validation.constraints.*;
import java.util.Date;

@Data
public class EmployeeDto {
    private Long employeeId;

    @Size(min = 10, max = 50, message = "Name only accept 10-50 characters")
    @NotBlank(message = "Name cannot be empty")
    private String name;

    private Date birthDate;
    private String gender;

    @Email(regexp = "([a-zA-Z0-9]+)([\\.{1}])?([a-zA-Z0-9]+)\\@gmail([\\.])com", message = "Gmail address is not valid")
    @NotBlank(message = "Email cannot be empty")
    private String email;
}
