package com.projectweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
	
}
