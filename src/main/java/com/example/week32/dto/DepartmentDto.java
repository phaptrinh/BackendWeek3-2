package com.example.week32.dto;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class DepartmentDto {
    private Long departmentId;

    @Size(min = 10, max = 50, message = "Department name only accept 10-50 characters")
    @NotBlank(message = "Department name cannot be empty")
    private String deptName;

    @NotBlank(message = "Desciption cannot be empty")
    private String desciption;

    @Valid
    private List<EmployeeDto> employeeDtos;
}
