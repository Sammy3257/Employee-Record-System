package com.Employee_recode_system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "Records")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class records {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public  Long id;

    public String fullname;
    public String email;
    public String position;
    public String department;
    public Double salary;
    public LocalDate hire_Date;
}
