package com.example.wendycode.controller;

import com.example.wendycode.entity.Employee;
import com.example.wendycode.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:5173/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping("/employee")
    public List<Employee> fetchEmployees(){
        return employeeRepository.findAll();
    }
}



