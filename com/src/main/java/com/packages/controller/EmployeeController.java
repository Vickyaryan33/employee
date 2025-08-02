package com.packages.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packages.entity.Employee;
import com.packages.service.EmployeeService;

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
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {
	    Optional<Employee> employee= employeeService.getById(id);
	    return new ResponseEntity<>(employee,HttpStatus.OK);
	}
	
	  @PutMapping("/{id}")
	    public ResponseEntity<Employee> updateEmployeeById(@PathVariable Long id, @RequestBody Employee e) {
	        Employee emOptional = employeeService.getEmployeeById(id, e);
	        return new ResponseEntity<>(emOptional, HttpStatus.OK);
	    }
}
