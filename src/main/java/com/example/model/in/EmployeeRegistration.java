package com.example.model.in;

import java.util.List;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeRegistration {
	
	private String employeeId;
	private String name;
	private String designation;
	private String role;
	private String project;

	private List<SelectedArray> selectedArray;
	private int id;
}
