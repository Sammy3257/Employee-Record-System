package com.Employee_recode_system.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

@Entity
@Table(name = "Records")
public class Records {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullname;
    private String email;
    private String position;
    private String department;
    private Double salary;
    private LocalDate hire_Date;


    public Records() {
    }

    public Records(Long id, String fullname, String email, String position, String department, Double salary, LocalDate hire_Date) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.position = position;
        this.department = department;
        this.salary = salary;
        this.hire_Date = hire_Date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getHire_Date() {
        return hire_Date;
    }

    public void setHire_Date(LocalDate hire_Date) {
        this.hire_Date = hire_Date;
    }


}
