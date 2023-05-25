package com.example.service;

import com.example.entity.EmployeeEntity;
import com.example.model.in.EmployeeRegistration;
import com.example.model.in.SkillTrackerRequest;
import com.example.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public void saveEmployee(SkillTrackerRequest skillTrackerRequest) {
        List<EmployeeRegistration> employeeRegistrations = skillTrackerRequest.getEmployeeRegistration();
        List<EmployeeEntity> employeeEntities = new ArrayList<>();

        for (EmployeeRegistration employeeRegistration : employeeRegistrations) {
            EmployeeEntity employeeEntity = new EmployeeEntity();
            employeeEntity.setEmployeeId(employeeRegistration.getEmployeeId());
            employeeEntity.setCreatedDate(LocalDate.now());
            employeeEntity.setRole(employeeRegistration.getRole());
            employeeEntity.setName(employeeRegistration.getName());
            employeeEntity.setProject(employeeRegistration.getProject());
            employeeEntity.setDesignation(employeeRegistration.getDesignation());
            employeeEntity.setCreatedDate(LocalDate.now());
            employeeEntities.add(employeeEntity);
        }
        employeeRepository.saveAll(employeeEntities);
    }
}
