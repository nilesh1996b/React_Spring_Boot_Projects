package com.nilesh.employeemanagement.controller;

import com.nilesh.employeemanagement.model.Employee;
import com.nilesh.employeemanagement.repository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "http://localhost:3000")
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRespository employeeRespository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployee()
    {
        return employeeRespository.findAll();
    }

}
