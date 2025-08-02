package com.packages.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.packages.Repository.EmployeeRepository;
import com.packages.entity.Employee;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee createEmployee(Employee e) {
		return employeeRepository.save(e);
	}
	
	public Optional<Employee> getById(Long id) {
		
		return  employeeRepository.findById(id);
	}
	public Employee getEmployeeById(Long id, Employee e) {
		Optional<Employee> exsitEmployee=employeeRepository.findById(id);
		Employee exsitEmployees=exsitEmployee.get();
		exsitEmployees.setEmail(e.getEmail());
		return employeeRepository.save(exsitEmployees);
		
	}
}
