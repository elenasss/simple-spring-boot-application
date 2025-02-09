package com.example.service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getEmployees(){
        return repository.findAll();
    };

    public Employee addEmployee(Employee employee){
        return repository.save(employee);
    }

    public Employee updateEmployee(Employee employee){
        var currentEmployee = repository.findById(employee.getId()).get();
        currentEmployee.setFirstName(employee.getFirstName());
        currentEmployee.setLastName(employee.getLastName());
        currentEmployee.setEmail(employee.getEmail());
        currentEmployee.setJobId(employee.getJobId());
        currentEmployee.setSalary(employee.getSalary());
        return repository.save(currentEmployee);
    }

    public void deleteEmployee(Employee employee){
        repository.delete(employee);
    }
}