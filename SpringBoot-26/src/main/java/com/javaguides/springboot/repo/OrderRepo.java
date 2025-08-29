package com.javaguides.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaguides.springboot.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Long> 
{

}
