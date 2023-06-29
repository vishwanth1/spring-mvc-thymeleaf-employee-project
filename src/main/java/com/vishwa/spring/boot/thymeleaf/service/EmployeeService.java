package com.vishwa.spring.boot.thymeleaf.service;

import java.util.List;

import com.vishwa.spring.boot.thymeleaf.entity.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    void save(Employee theEmployee);

    void deleteById(int theId);


}
