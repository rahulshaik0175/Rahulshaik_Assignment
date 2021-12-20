package com.rahul.repository;

import org.springframework.data.repository.CrudRepository;

import com.rahul.model.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, String> {
	
}