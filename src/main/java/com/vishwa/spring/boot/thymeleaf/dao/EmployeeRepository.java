package com.vishwa.spring.boot.thymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishwa.spring.boot.thymeleaf.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByOrderByLastNameAsc();
}

