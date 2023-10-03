package com.example.first.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.first.user.entity.User;
import com.example.first.user.service.UserService;


@RestController
public class UserController
{
	private final UserService userservice;
	
	public UserController(UserService userservice) 
	{
		this.userservice=userservice;
	}


	
	public ResponseEntity<User> saveStudent(@RequestBody User s) 
	{
		System.out.println("hjghjbhb");
		return userservice.saveStudent(s);
		
	}
	@GetMapping("/api/students")
	public List<User> getStudents()
	{
		return userservice.getStudents();
	}
	@GetMapping("/api/students/{id}")
	public ResponseEntity<User> getStudentsId(@PathVariable("id") Long id)
	{
		return userservice.getStudentsId(id);
	}
	@PutMapping("/api/studentUpdate/{id}")
	public ResponseEntity<User> getStudentUpdate(@PathVariable("id") Long id, @RequestBody User us)
	{
		return userservice.getStudentUpdate(id, us);
	}
	@DeleteMapping("/api/studentDelete/{id}")
	public ResponseEntity<User> deleteById(@PathVariable("id") Long id)
	{
		return userservice.deleteById(id);
	}
	


}
