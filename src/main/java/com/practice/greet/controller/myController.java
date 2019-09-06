package com.practice.greet.controller;

import com.practice.greet.Employee;
import com.practice.greet.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
    public class myController {
    @Autowired
    private EmployeeService employeeService;

     @GetMapping("/hello")
     public String greet(){ return "Hello World";}

    @GetMapping("/employee")
    public List<Employee> getEmployee() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeID(@PathVariable int id){
        return employeeService.getEmployeeID(id);
    }

    @PostMapping("/employee")
            public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }
    @PutMapping("/employee/{id}")
    public void updateEmployee(@PathVariable int id,@RequestBody Employee employee){
        employeeService.updateEmployee(id,employee);
    }
    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }
}

