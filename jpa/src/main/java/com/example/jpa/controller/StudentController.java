package com.example.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.entity.Student;

import repo.Repo;



@RestController
public class StudentController 
{/*
	 * @Autowired public Repo r ; public StudentController (Repo r) { this.r=r; }
	 */
	
	public final Repo r ;
	
	
	public StudentController(Repo r) {
	super();
	this.r = r;
}


	@PostMapping("/api/students")
	public ResponseEntity<Student> saveStudent(@RequestBody Student s) 
	{
		return new ResponseEntity<>(r.save(s),HttpStatus.CREATED);
		
	}

}
