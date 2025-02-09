package com.example.model;

import jakarta.persistence.GeneratedValue;
import lombok.Data;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "hire_date")
    private LocalDate hireDate;

    @Column(name = "job_id")
    private String jobId;

    @Column(name = "salary")
    private double salary;
}