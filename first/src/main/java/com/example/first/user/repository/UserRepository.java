package com.example.first.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.first.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
                          
}
