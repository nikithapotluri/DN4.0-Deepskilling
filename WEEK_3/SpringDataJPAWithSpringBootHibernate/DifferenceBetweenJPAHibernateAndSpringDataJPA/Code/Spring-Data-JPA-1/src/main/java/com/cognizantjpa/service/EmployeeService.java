package com.cognizantjpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.cognizantjpa.model.Employee;
import com.cognizantjpa.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public Optional<Employee> getEmployee(int id) {
		return employeeRepository.findById(id);
	}
	
	public void addEmployee(Employee emp) {
		employeeRepository.save(emp);
	}
	
}
