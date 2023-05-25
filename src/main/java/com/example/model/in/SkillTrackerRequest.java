package com.example.model.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SkillTrackerRequest {

	private List<Domain> domain;
	private List<Technical> technical;
	
	private List<EmployeeNameDetail> employeeNameDetails;
	private List<EmployeeRegistration> employeeRegistration;

}