package org.globallogic.springboot.service;

import java.util.List;

import org.globallogic.springboot.model.Employee;

public interface EmployeeService {
	//create a employee Record
	Employee saveEmployee(Employee employee);
	//To Read the employee record--read all or one of them
	List<Employee> getAllEmployees();
	//To Read single employee record
	Employee getEmployeeById(long id);
}
