package com.example.first.emp.service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.first.emp.entity.Employee;
import com.example.first.emp.repository.EmployeeRepository;
import com.example.first.user.entity.User;
@Service
public class EmployeeService 
{
	private final EmployeeRepository emprps;
	public EmployeeService(EmployeeRepository emprps)
	{
		this.emprps=emprps;
	}
	
	public ResponseEntity<Employee> saveEmployee(Employee emp) 
	{
		emp.setState(1);
		emp.setDeleted(false);
		emp.setCreatedTime(LocalDateTime.now());
		emp.setModifiedTime(LocalDateTime.now());
	
		return new ResponseEntity<>(emprps.save(emp),HttpStatus.CREATED);
		
		
	}

	public List<Employee> getEmployee() 
	{
	   List<Employee> emps =emprps.findAll();
	   emprps.findById(null);
		return emps;
	}

	public  ResponseEntity<Employee> getEmployeeId(@PathVariable long id) {
		Optional<Employee> emps =  emprps.findById(id);
		if(emps.isPresent()) 
		{
			return new ResponseEntity<>(emps.get(),HttpStatus.OK );
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}

	public ResponseEntity<Employee> updateEmployeeId(@PathVariable("id") Long id, @RequestBody Employee emp) {
		Optional<Employee> em =  emprps.findById(id);
		if(em.isPresent()) 
		{
			em.get().setEmployeeFirstName(emp.getEmployeeFirstName());
			em.get().setEmployeeLastName(emp.getEmployeeLastName());
			em.get().setEmployeeMobile(emp.getEmployeeMobile());
			em.get().setEmployeeEmail(emp.getEmployeeEmail());
			
			
			return new ResponseEntity<>(emprps.save(em.get()),HttpStatus.CREATED);
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity<Employee> deleteEmployeeById(Long id) {
		Optional<Employee> en= emprps.findById(id);
		if(en.isPresent()) 
		{
			emprps.deleteById(id);
			return new ResponseEntity<>(HttpStatus.CREATED);
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}

}
