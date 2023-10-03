package com.crud.dao;

import java.util.List;

import com.crud.dto.Employee;

public interface EmployeeDao 
{
	public List<Employee> getListOfEmployees();
	
	public void addEmployee(Employee emp);
	 
	public void updateEmployee(Employee emp);
	
	public void deleteEmployee(String firstname);
	 
	public Employee findEmployee(String firstname);
	

}
