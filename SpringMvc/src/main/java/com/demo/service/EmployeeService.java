package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.EmployeeDao;
import com.demo.model.Employee1;
import com.demo.repository.RepositoryClass;

@Component
@Service
public class EmployeeService 
{
	
	
	@Autowired
	EmployeeDao employeedao;
	
	private final JdbcTemplate jdbcTemplate;

    @Autowired
    public  EmployeeService (JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
	
	public void addEmp(Employee1 emp) 
	{
		employeedao.addEmployee(emp);
		
		
		
	}
	public List<Employee1> getAllEmp()
	{
		return employeedao.getAllEmp();
	}
	public Employee1 getById(Long id) 
	{
		return employeedao.getEmpById(id);
	}
	public void updateEmp(Employee1 emp) 
	{
		employeedao.updateEmp(emp);
	}
	public void deleteEmployee1(Long id) 
	{
		employeedao.deleteEmp(id);
	
	}
	public boolean validateUser(String email, String password) {
		String sql = "SELECT COUNT(*) FROM employee1 where email = ? AND password = ?";
        int count = jdbcTemplate.queryForObject(sql, Integer.class, email, password);
       
        return count == 1;
		
	}
	

}
