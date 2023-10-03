package com.example.first.emp.entity;

import java.time.Instant;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_id")
	private Long employeeId;
	
	@Column(name="employee_firstname")
	private String employeeFirstName;
	
	@Column(name="employee_lastname")
	private String employeeLastName;
	
	@Column(name="employee_email")
	private String employeeEmail;
	
	@Column(name="employee_mobileno")
	private String employeeMobileNo;
	
	@Column(name="state")
	private Integer state;
	
	@Column(name="deleted")
	private boolean deleted;
	@Column(name="created_time")
	private LocalDateTime createdTime;
	@Column(name="modified_time")
	private LocalDateTime modifiedTime;
	
	public Employee(Long employeeId, String employeeFirstName, String employeeLastName, String employeeEmail,
			String employeeMobileNo, Integer state, boolean deleted, LocalDateTime createdTime, LocalDateTime modifiedTime)
	{
		super();
		this.employeeId = employeeId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeeEmail = employeeEmail;
		this.employeeMobileNo = employeeMobileNo;
		this.state = state;
		this.deleted = deleted;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
	}
	public Employee()
	{
		
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeeMobile() {
		return employeeMobileNo;
	}
	public void setEmployeeMobile(String employeeMobileNo) {
		this.employeeMobileNo = employeeMobileNo;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public LocalDateTime getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
	}
	public LocalDateTime getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(LocalDateTime modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeFirstName=" + employeeFirstName + ", employeeLastName="
				+ employeeLastName + ", employeeEmail=" + employeeEmail + ", employeeMobileNo=" + employeeMobileNo
				+ ", state=" + state + ", deleted=" + deleted + ", createdTime=" + createdTime + ", modifiedTime="
				+ modifiedTime + "]";
	}
	
	
	
	
	

}
