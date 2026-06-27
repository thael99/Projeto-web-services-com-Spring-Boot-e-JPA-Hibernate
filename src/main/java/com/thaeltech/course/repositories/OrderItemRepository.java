package com.thaeltech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thaeltech.course.entities.OrderItem;
import com.thaeltech.course.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{
	
}
