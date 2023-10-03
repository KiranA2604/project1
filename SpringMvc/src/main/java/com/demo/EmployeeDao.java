package com.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.demo.model.Employee1;

@Component

public class EmployeeDao 
{
	@Autowired
	HibernateTemplate hiberneteTemplate;
	
   
	
	@Transactional
	public void addEmployee(Employee1 emp)
	{
		hiberneteTemplate.save(emp);
		
	}
	
	
	//get all employee
	public List<Employee1> getAllEmp()
	{
		return hiberneteTemplate.loadAll(Employee1.class);
	}
	
	//get employee by id
	@Transactional
	public Employee1 getEmpById(Long id)
	{
		
		
		Employee1 emp= hiberneteTemplate.get(Employee1.class, id);
		return emp;
	}
	
	
	//update employee
	
	@Transactional
	public void updateEmp(Employee1 emp)
	{
		hiberneteTemplate.update(emp);
	}
	
	
	//delete employee
	@Transactional
	public void deleteEmp(Long id)
	{
		hiberneteTemplate.delete(hiberneteTemplate.load(Employee1.class, id));
	}
	
	
	 
	

}
