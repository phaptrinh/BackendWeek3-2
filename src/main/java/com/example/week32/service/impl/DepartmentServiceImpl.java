package com.example.week32.service.impl;

import com.example.week32.dto.DepartmentDto;
import com.example.week32.service.DepartmentService;
import com.example.week32.util.ThrowExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private Logger logger = LoggerFactory.getLogger(DepartmentServiceImpl.class);


    @Override
    public DepartmentDto getDepartmentDto(DepartmentDto departmentDto) {
        logger.info("Input argument: {}", departmentDto.toString());
        return departmentDto;
    }
}
