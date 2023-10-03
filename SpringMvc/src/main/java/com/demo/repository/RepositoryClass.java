package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Employee1;

public interface RepositoryClass extends JpaRepository<Employee1, Long>
{

}
