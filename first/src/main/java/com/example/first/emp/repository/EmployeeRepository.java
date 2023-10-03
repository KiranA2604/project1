package com.example.first.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.first.emp.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
 
}
