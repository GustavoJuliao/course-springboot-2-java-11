package com.projectweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
	
}
