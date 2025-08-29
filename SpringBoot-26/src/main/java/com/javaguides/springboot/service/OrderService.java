package com.javaguides.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaguides.springboot.model.OrderRequest;
import com.javaguides.springboot.repo.OrderRepo;

@Service
public interface OrderService 
{ 
public Long placeOrder(OrderRequest orderRequest);

}
