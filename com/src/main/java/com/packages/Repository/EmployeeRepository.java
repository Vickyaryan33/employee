package com.employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
