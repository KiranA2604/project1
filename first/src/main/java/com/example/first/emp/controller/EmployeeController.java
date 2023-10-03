package com.example.first.emp.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first.emp.entity.Employee;
import com.example.first.emp.service.EmployeeService;
import com.example.first.user.entity.User;

@RestController
@RequestMapping("/v1")
public class EmployeeController
{
	private final EmployeeService empService;
	
	public EmployeeController(EmployeeService empService)
	{
		this.empService=empService;
		
	}
	@PostMapping("/api/employee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody  Employee emp)
	{
		return empService.saveEmployee(emp);
		
	}
	@GetMapping("/api/employee1")
	public List<Employee> getEmployee()
	{
		
		return empService.getEmployee();
		
	}
	@GetMapping("/api/employee2/{id}")
	public ResponseEntity<Employee> getEmployeeId(@PathVariable("id") Long id)
	{
		return empService.getEmployeeId(id);
	}
	@PutMapping("/api/employee3/{id}")
	public ResponseEntity<Employee> getUpdateEmployee(@PathVariable("id") Long id, @RequestBody Employee emp)
	{
		return empService.updateEmployeeId(id,emp);
	}
	@DeleteMapping("/api/employee4/{id}")
	public ResponseEntity<Employee> deleteEmployeeById(@PathVariable("id") Long id)
	{
		return empService.deleteEmployeeById(id);
	}
}
