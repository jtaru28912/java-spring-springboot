package org.globallogic.springboot.serviceImpl;

import java.util.List;

import org.globallogic.springboot.exception.ResourceNotFoundException;
import org.globallogic.springboot.model.Employee;
import org.globallogic.springboot.repository.EmployeeRepository;
import org.globallogic.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

public class EmployeeServiceImpl implements EmployeeService {
	// Dependency Injection
	@Autowired
	private EmployeeRepository employeeRepository;
	// constructor dependency Injection
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
		java.util.Optional<Employee> employee = employeeRepository.findById(id);
		if(employee.isPresent()) {
			return employee.get();
		}
		else {
			throw new ResourceNotFoundException("Employee","Id",id);
		}
	}

}
