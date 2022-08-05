package org.globallogic.springboot.controller;

import java.util.List;

import org.globallogic.springboot.model.Employee;
import org.globallogic.springboot.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {
	
	private EmployeeService employeeService;

	public EmployeeController() {
		super();
	}

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	// build create employee REST API
	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>
		(employeeService.saveEmployee(employee),
				HttpStatus.CREATED);

	}
	//build a method to get Employees
	@GetMapping()
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	@GetMapping("{id}")
	//Build a method to get single Employee Record
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){
		
	}
}
