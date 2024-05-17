package com.example.demo.core.repository;

import com.example.demo.core.entity.EmployeeTbl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeTbl, Long> {

    List<EmployeeTbl> findByName(String name);

    List<EmployeeTbl> findByNameAndDepartment(String name, String department);
}