package com.example.week32.service.impl;

import com.example.week32.dto.EmployeeDto;
import com.example.week32.service.EmployeeService;
import com.example.week32.util.ThrowExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Override
    public EmployeeDto getEmployeeDto(EmployeeDto employeeDto) throws Exception {
        logger.info("Input argument: {}", employeeDto.toString());
        ThrowExceptionUtils.throwExceptionWithProbabilityOf50Percent();
        return employeeDto;
    }
}