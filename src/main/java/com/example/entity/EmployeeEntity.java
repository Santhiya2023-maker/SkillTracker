package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Employee_Registration")
public class EmployeeEntity {
    @Id
    @Column(name = "Employee_ID")
    private String employeeId;
    @Column(name = "Employee_Name")
    private String name;
    @Column(name ="Designation")
    private String designation;
    @Column(name = "Role")
    private String role;
    @Column(name = "Project")
    private String project;
    @Column(name = "Created_Date")
    private LocalDate createdDate;
}
