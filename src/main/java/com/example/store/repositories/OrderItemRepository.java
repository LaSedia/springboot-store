package com.example.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.store.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
