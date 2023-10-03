package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.model.Employee1;
import com.demo.service.EmployeeService;

@Controller
@RequestMapping
public class EmployeeController 
{
	@Autowired 
   EmployeeService employeeservice;
	
	public EmployeeController( EmployeeService employeeservice) 
	{
		this.employeeservice=employeeservice;
	}
	@GetMapping("addEmployee")
	public String addEmp() 
	{
		return "AddEmployee";
	}
	@PostMapping("/insertEmployee")
	public String insertEmployee(@ModelAttribute("insertEmployee") @RequestBody Employee1 emp) 
	{
	 System.out.println(emp.getClass().getName());
	 
		employeeservice.addEmp(emp);
	
		return "home";
	}
	//lode employee data
		@GetMapping("employeeReport")
		public String loadEmployee(Model m)
		{
			m.addAttribute("employee1", employeeservice.getAllEmp());
			m.addAttribute("title", "Employee Report");
			
			return "EmployeeReport";
		} 
		@GetMapping("/editEmployee/{id}")
		public String loadEditForm(@PathVariable(value="id") Long id,Model m) 
		{
			Employee1 em = employeeservice.getById(id);
			m.addAttribute("employee1", em);
			m.addAttribute("title","Edit Employee");
			
			return "EditEmployee";
			
		}
		@PostMapping("/editEmployee/updateEmployee")
		public String updateEmp(@ModelAttribute("updateEmployee") Employee1 emp) 
		{
			employeeservice.updateEmp(emp);
			return "employeeReport";
		}
		 @PostMapping("/login")
		    public String login(@RequestParam String email, @RequestParam String password) {
		        if (employeeservice.validateUser(email, password)) {
		            // Successful login
		            return "EmployeeReport";
		        } else {
		              System.out.println("not valid");
		            return "home";
		            
		        
		        }
		    
		 }
		

	  

	    
	}

		
