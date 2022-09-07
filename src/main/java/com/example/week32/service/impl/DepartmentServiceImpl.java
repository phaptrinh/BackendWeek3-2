package com.example.week32.service.impl;

import com.example.week32.dto.DepartmentDto;
import com.example.week32.service.DepartmentService;
import com.example.week32.util.ThrowExceptionUtils;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Override
    public DepartmentDto getDepartmentDto(DepartmentDto departmentDto) {
        return departmentDto;
    }
}
