package com.example.week32.service.impl;

import com.example.week32.dto.EmployeeDto;
import com.example.week32.service.EmployeeService;
import com.example.week32.util.ThrowExceptionUtils;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public EmployeeDto getEmployeeDto(EmployeeDto employeeDto) throws Exception {
        ThrowExceptionUtils.throwExceptionWithProbabilityOf50Percent();
        return employeeDto;
    }
}