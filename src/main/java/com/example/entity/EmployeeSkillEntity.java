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
@Table(name = "Employee_Skill")
public class EmployeeSkillEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "Employee_ID")
    private String employeeId;
    @Column(name = "Skill_Name")
    private String skillName;
    @Column(name = "Category")
    private String category;
    @Column(name = "Proficiency_Level")
    private String proficiencyLevel;
    @Column(name = "Created_Date")
    private LocalDate createdDate;
}
