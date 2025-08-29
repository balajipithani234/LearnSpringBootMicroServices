package com.javaguides.springboot.service;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaguides.springboot.client.ProductService;
import com.javaguides.springboot.entity.Order;
import com.javaguides.springboot.model.OrderRequest;
import com.javaguides.springboot.repo.OrderRepo;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class OrderServiceImpl implements OrderService 
{
 private static final org.apache.logging.log4j.Logger log=org.apache.logging.log4j.LogManager.getLogger(OrderService.class);
 @Autowired
 private OrderRepo orderRepo;
 @Autowired
 private ProductService productService;
 
 @Override
 public Long placeOrder(OrderRequest orderRequest) 
 {
	 log.info("before placing order");
	 productService.reduceQuantity(orderRequest.getProductId(),orderRequest.getQuantity());
	 log.info("after checking product availability for the product "+orderRequest.getProductId());
	 Order order=new Order();
	 order.setProductId(orderRequest.getProductId());
	 order.setPrice(orderRequest.getAmount());
	 order.setOrderDate(Instant.now());
	 order.setOrderStatus("CREATED");
	 order.setQuantity(orderRequest.getQuantity());
	 
	 log.info("order placed");
	 order=orderRepo.save(order);
	 log.info("product saved sucessfully after placing order");
	return order.getOrderId();
 }
  
}
