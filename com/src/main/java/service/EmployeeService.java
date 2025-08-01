package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.EmployeeRepository;
import entity.Employee;


@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee createEmployee(Employee e) {
		return employeeRepository.save(e);
	}
	

}
