package com.example.first.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.first.user.entity.User;
import com.example.first.user.repository.UserRepository;

@Service
public class UserService
{
	
	private final UserRepository repo;
	public UserService(UserRepository repo) 
	{
		this.repo=repo;
	}

	public ResponseEntity<User> saveStudent(User s) 
	{
		return new ResponseEntity<>(repo.save(s),HttpStatus.CREATED);
		
	}

	public List<User> getStudents() {
		// TODO Auto-generated method stub
		List<User> users=repo.findAll();
		
		
		return users;
	}

	public ResponseEntity<User> getStudentsId(@PathVariable long id) {
		Optional<User> users=repo.findById(id);
		if(users.isPresent()) 
		{
			return new ResponseEntity<>(users.get(),HttpStatus.OK );
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}

	public ResponseEntity<User> getStudentUpdate(@PathVariable long id,@RequestBody User us) {
		Optional<User> users=repo.findById(id);
		if(users.isPresent()) 
		{
			users.get().setName(us.getName());
			users.get().setEmail(us.getEmail());
			return new ResponseEntity<>(repo.save(users.get()),HttpStatus.CREATED);
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity<User> deleteById(Long id) {
		Optional<User> users=repo.findById(id);
		if(users.isPresent()) 
		{
			repo.deleteById(id);
			return new ResponseEntity<>(HttpStatus.CREATED);
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	


	

}
