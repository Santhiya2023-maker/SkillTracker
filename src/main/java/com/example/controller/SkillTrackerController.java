package com.example.controller;

import com.example.service.EmployeeService;
import com.example.service.EmployeeSkillService;
import com.example.service.SkillService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.in.SkillTrackerRequest;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class SkillTrackerController {
	private final SkillService skillService;
	private final EmployeeService employeeService;
	private final EmployeeSkillService employeeSkillService;
	@PostMapping(value = "/SkillTracker", produces = MediaType.APPLICATION_JSON_VALUE)
	public SkillTrackerRequest skillTracking(@RequestBody SkillTrackerRequest skillTrackerRequest) {

		System.out.println("Input request is {}" + skillTrackerRequest);
		skillService.saveSkills(skillTrackerRequest);
		employeeService.saveEmployee(skillTrackerRequest);
		employeeSkillService.saveEmployeeSkill(skillTrackerRequest);
		return skillTrackerRequest;

	}
}
