package com.example.controller;

import com.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping(path = "api/employees")
//@AllArgsConstructor
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @PostMapping("/add_employee")
    public String addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return "The employee is added";
    }

    @PutMapping("/update_employee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/delete_employee")
    public String deleteEmployee(@PathVariable Employee employee){
        employeeService.deleteEmployee(employee);
        return "The employee is deleted";
    }
}