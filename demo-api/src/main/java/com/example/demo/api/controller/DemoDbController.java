package com.example.demo.api.controller;

import com.example.demo.core.entity.EmployeeTbl;
import com.example.demo.core.service.DemoDbService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class DemoDbController {

    private final DemoDbService demoDbService;

    @GetMapping("/EmployeeTbl/get")
    public String getRuntimeTimes() {
        String name = demoDbService.getFirstEmployeeName();
        log.info("name: {}", name);
        return name;
    }

    @GetMapping("/EmployeeTbl/create")
    public EmployeeTbl createEmployee() {
        EmployeeTbl employeeTbl = demoDbService.saveEmployee(createEmployeeData());
        log.info("EmployeeTbl created: {}", employeeTbl);
        return employeeTbl;
    }

    private EmployeeTbl createEmployeeData() {
        EmployeeTbl employeeTbl = new EmployeeTbl();
        employeeTbl.setName("John Doe");
        employeeTbl.setDepartment("IT");
        return employeeTbl;
    }
}
