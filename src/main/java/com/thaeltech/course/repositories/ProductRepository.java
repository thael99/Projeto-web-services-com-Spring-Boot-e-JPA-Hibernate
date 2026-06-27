package com.thaeltech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thaeltech.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
