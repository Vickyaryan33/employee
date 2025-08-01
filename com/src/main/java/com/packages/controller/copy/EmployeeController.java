package com.employee.controller.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee e) {
	    Employee e1 = employeeService.createEmployee(e);
	    return new ResponseEntity<>(e1, HttpStatus.CREATED);
	}
}
