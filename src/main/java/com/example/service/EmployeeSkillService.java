package com.example.service;

import com.example.entity.EmployeeSkillEntity;
import com.example.model.in.EmployeeNameDetail;
import com.example.model.in.EmployeeRegistration;
import com.example.model.in.SelectedArray;
import com.example.model.in.SkillTrackerRequest;
import com.example.repository.EmployeeSkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeSkillService {
    private final EmployeeSkillRepository employeeSkillRepository;

    public void saveEmployeeSkill(SkillTrackerRequest skillTrackerRequest) {
        List<EmployeeRegistration> employeeNameDetails = skillTrackerRequest.getEmployeeRegistration();
        List<EmployeeSkillEntity> employeeSkillEntities = new ArrayList<>();
        for (EmployeeRegistration employeeRegistration : employeeNameDetails) {

            for (SelectedArray selectedArray : employeeRegistration.getSelectedArray()) {

                EmployeeSkillEntity employeeSkillEntity = new EmployeeSkillEntity();
                employeeSkillEntity.setEmployeeId(employeeRegistration.getEmployeeId());
                employeeSkillEntity.setCategory(selectedArray.getCategories());
                employeeSkillEntity.setSkillName(selectedArray.getSkill());
                employeeSkillEntity.setProficiencyLevel(selectedArray.getProficiency());
                employeeSkillEntity.setCreatedDate(LocalDate.now());
                employeeSkillEntities.add(employeeSkillEntity);
            }
        }
        employeeSkillRepository.saveAll(employeeSkillEntities);

    }
}
