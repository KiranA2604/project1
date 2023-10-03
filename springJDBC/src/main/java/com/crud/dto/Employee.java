package com.crud.dto;



public class Employee
{
	private int employeeid;
	private String firstname,lastname,email;
	
	
	public Employee(String firstname) {
		super();
		this.firstname = firstname;
	}
	public Employee() 
	{
		super();
	}
	
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	

}
