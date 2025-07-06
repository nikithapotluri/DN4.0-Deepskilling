package com.cognizantjpa.repository;

import org.springframework.stereotype.Repository;

import com.cognizantjpa.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
