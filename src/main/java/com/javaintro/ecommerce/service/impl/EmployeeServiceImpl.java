package com.javaintro.ecommerce.service.impl;

import com.javaintro.ecommerce.dto.EmployeeDto;
import com.javaintro.ecommerce.exception.Employee;
import com.javaintro.ecommerce.mapper.EmployeeMapper;
import com.javaintro.ecommerce.repository.EmployeeRepository;
import com.javaintro.ecommerce.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
