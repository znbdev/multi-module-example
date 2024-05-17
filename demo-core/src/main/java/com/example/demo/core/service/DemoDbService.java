package com.example.demo.core.service;

import com.example.demo.core.entity.EmployeeTbl;
import com.example.demo.core.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class DemoDbService {

    private final EmployeeRepository employeeRepository;

    public String getFirstEmployeeName() {
        List<EmployeeTbl> employees = employeeRepository.findAll();
        log.info("Employees: {}", employees);
        String name = "No employees found.";
        if (!employees.isEmpty()) {
            name = employees.get(0).getName();
        }
        return "First employee name: " + name;
    }

    public EmployeeTbl saveEmployee(EmployeeTbl employee) {
        return employeeRepository.save(employee);
    }
}