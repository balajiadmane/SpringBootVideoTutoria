package com.EmployeeDataAPI.Repository;

import org.springframework.data.repository.CrudRepository;

import com.EmployeeDataAPI.Modal.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
