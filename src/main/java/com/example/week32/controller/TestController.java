package com.example.week32.controller;

import com.example.week32.dto.DepartmentDto;
import com.example.week32.dto.EmployeeDto;
import com.example.week32.dto.response.BaseResponse;
import com.example.week32.service.DepartmentService;
import com.example.week32.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class TestController {
    @Autowired
    EmployeeService employeeService;

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/test-employee-dto")
    public ResponseEntity<?> testValidEmployeeDto(@RequestBody @Valid EmployeeDto employeeDto) throws Exception {
        EmployeeDto result = employeeService.getEmployeeDto(employeeDto);
        return ResponseEntity.ok(BaseResponse.success(result));
    }

    @GetMapping("/test-department-dto")
    public ResponseEntity<?> testValidDepartmentDto(@RequestBody @Valid DepartmentDto departmentDto) {
        DepartmentDto result = departmentService.getDepartmentDto(departmentDto);
        return ResponseEntity.ok(BaseResponse.success(result));
    }

}
