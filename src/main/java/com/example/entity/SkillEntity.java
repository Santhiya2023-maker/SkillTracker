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
@Table(name = "SKILL_DETAILS")
public class SkillEntity {
    @Id
    @Column(name = "Skill_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int skillId;
    @Column(name = "Skill_Name")
    private String skillName;
    @Column(name = "Category")
    private String category;
    @Column(name = "Created_Date")
    private LocalDate createdDate;
}
