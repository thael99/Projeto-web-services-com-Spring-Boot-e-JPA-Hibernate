package com.thaeltech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thaeltech.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
